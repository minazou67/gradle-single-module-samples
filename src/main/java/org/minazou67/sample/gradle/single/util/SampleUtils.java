package org.minazou67.sample.gradle.single.util;

/**
 * サンプルのユーティリティクラスです。
 *
 * @author minazou67
 */
public class SampleUtils {

	/**
	 * 指定された値を標準出力に出力します。
	 *
	 * @param value 出力対象の値
	 */
	public static void println(Integer value) {
		try {
			System.out.println(value);
		} catch (final Exception e) {
			// ignore
		}
	}
}