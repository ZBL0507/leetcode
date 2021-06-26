package com.zbl.algorithm.leetcode;

/**
 * 颠倒二进制位
 * 颠倒给定的 32 位无符号整数的二进制位。
 * <p>
 * 示例 1：
 * 输入: 00000010100101000001111010011100
 * 输出: 00111001011110000010100101000000
 * 解释: 输入的二进制串 00000010100101000001111010011100 表示无符号整数 43261596，
 * 因此返回 964176192，其二进制表示形式为 00111001011110000010100101000000。
 * <p>
 * 示例 2：
 * 输入：11111111111111111111111111111101
 * 输出：10111111111111111111111111111111
 * 解释：输入的二进制串 11111111111111111111111111111101 表示无符号整数 4294967293，
 *      因此返回 3221225471 其二进制表示形式为 10111111111111111111111111111111 。
 * <p>
 * 示例 1：
 * 输入：n = 00000010100101000001111010011100
 * 输出：964176192 (00111001011110000010100101000000)
 * 解释：输入的二进制串 00000010100101000001111010011100 表示无符号整数 43261596，
 * 因此返回 964176192，其二进制表示形式为 00111001011110000010100101000000。
 * <p>
 * 示例 2：
 * 输入：n = 11111111111111111111111111111101
 * 输出：3221225471 (10111111111111111111111111111111)
 * 解释：输入的二进制串 11111111111111111111111111111101 表示无符号整数 4294967293，
 *   因此返回 3221225471 其二进制表示形式为 10111111111111111111111111111111 。
 *
 * @author zbl
 * @version 1.0
 * @since 2021/6/23 14:19
 */
public class Test0041ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBits((int) 4294967293L));
        System.out.println((int) 3221225471L);
    }

    // you need treat n as an unsigned value
    private static int reverseBits(int n) {
        int[] temp = new int[32];

        for (int i = 0; i < 32; i++) {
            temp[temp.length - i - 1] = (n & 1);
            n = n >> 1;
        }

        int result = 0;
        for (int i = 0; i < temp.length; i++) {
            result += temp[i] << i;
        }

        return result;
    }
}