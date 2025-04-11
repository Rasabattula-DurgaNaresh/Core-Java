const HDWalletProvider = require('truffle-hdwallet-provider');
const Web3 = require('web3');
const {interface, bytecode} = require('./compile.js');

var mnemonic = "false endless roast rely gadget arch lunch elbow math slush curtain stomach";  // 12 word mnemonic
var provider_uri= "https://rinkeby.infura.io/G2XAPn2eS4pg9v8nQjRp";

const provider = new HDWalletProvider (mnemonic, provider_uri);

const web3 = new Web3(provider);

const deploy = async () => {
    const accounts = await web3.eth.getAccounts();
    console.log('Attempting to deploy from account', accounts[0]);

    const result = await new web3.eth.Contract(JSON.parse(interface))
        .deploy({data: bytecode, arguments: ['Hi!']})
        .send({from: accounts[0], gas: '1000000'})
    console.log('Contract deployed to', result.options.address);
};
   
deploy();