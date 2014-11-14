package org.minazou67.sample.gradle.single.service;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * {@link org.minazou67.sample.gradle.single.service.SampleService} のためのテストクラスです。
 *
 * @author minazou67
 */
public class SampleServiceTest {

	private static SampleService sut = new SampleService();

	/**
	 * {@link org.minazou67.sample.gradle.single.service.SampleService#execute(java.lang.Integer)} の正常系のテストです。<br>
	 * 引き数に数値を指定します。
	 */
	@Test
	public void testExecuteNumeric() {
		final Integer actual = sut.execute(10);
		assertThat(actual, is(20));
	}

	/**
	 * {@link org.minazou67.sample.gradle.single.service.SampleService#execute(java.lang.Integer)} の正常系のテストです。<br>
	 * 引き数に null を指定します。
	 */
	@Test
	public void testExecuteNull() {
		final Integer actual = sut.execute(null);
		assertNull(actual);
	}
}
