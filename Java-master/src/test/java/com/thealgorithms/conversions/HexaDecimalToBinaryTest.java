package com.thealgorithms.conversions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Unit tests for the {@link EndianConverter} class.
 */
public class HexaDecimalToBinaryTest {

    /**
     * Parameterized test to validate the conversion from little-endian to big-endian.
     * Hexadecimal values are passed as strings and converted to integers during the test.
     */
    @ParameterizedTest
    @CsvSource({
        "0x78563412, 0x12345678", "0x00000000, 0x00000000", "0x00000001, 0x01000000",
        "0xFFFFFFFF, 0xFFFFFFFF", // -1 in two's complement
        "0x0000007F, 0x7F000000" // Positive boundary case
    })
    public void
    testLittleToBigEndian(String inputHex, String expectedHex) {
        int input = (int) Long.parseLong(inputHex.substring(2), 16); // Convert hex string to int
        int expected = (int) Long.parseLong(expectedHex.substring(2), 16); // Convert hex string to int
        assertEquals(expected, EndianConverter.littleToBigEndian(input));
    }

    /**
     * Parameterized test to validate the conversion from big-endian to little-endian.
     */
    @ParameterizedTest
    @CsvSource({
        "0x12345678, 0x78563412", "0x00000000, 0x00000000", "0x01000000, 0x00000001",
        "0xFFFFFFFF, 0xFFFFFFFF", // -1 in two's complement
        "0x7F000000, 0x0000007F" // Positive boundary case
    })
    public void
    testBigToLittleEndian(String inputHex, String expectedHex) {
        int input = (int) Long.parseLong(inputHex.substring(2), 16); // Convert hex string to int
        int expected = (int) Long.parseLong(expectedHex.substring(2), 16); // Convert hex string to int
        assertEquals(expected, EndianConverter.bigToLittleEndian(input));
    }
}
