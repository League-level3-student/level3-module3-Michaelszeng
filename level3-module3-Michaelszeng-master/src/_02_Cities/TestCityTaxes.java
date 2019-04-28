package _02_Cities;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class TestCityTaxes {
	City sd = new SanDiego(1407000, 1.6);
	City bo = new Boston(673184, 1.2);
	City la = new LosAngeles(3976000, 1.4);
	City at = new Atlanta(472522, 1);
	
	@Test
	public void testSanDiego() {
		assertEquals(3251200.00, sd.getAnnualTaxes(), 0.01);
	}
	
	@Test
	public void testBoston() {
		assertEquals(1144412.80, bo.getAnnualTaxes(), 0.01);
	}

	@Test
	public void testLosAngeles() {
		assertEquals(3896480.00, la.getAnnualTaxes(), 0.01);
	}
		
	@Test
	public void testAtlanta() {
		assertEquals(945044.00, at.getAnnualTaxes(), 0.01);
	}

}
