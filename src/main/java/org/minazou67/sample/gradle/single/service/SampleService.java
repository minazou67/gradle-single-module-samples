package org.minazou67.sample.gradle.single.service;

/**
 * サンプルのサービスです。
 *
 * @author minazou67
 */
public class SampleService {

	/**
	 * 指定された値を元に計算処理を実行し結果を返却します。
	 *
	 * @param value 処理対象の値
	 * @return 処理結果の値
	 */
	public Integer execute(Integer value) {
		if (value == null) {
			return value;
		}
		return value + 10;
	}
}