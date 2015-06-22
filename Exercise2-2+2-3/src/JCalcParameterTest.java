// Beck; 1329591; Exercise2-3

import java.awt.Component;
import java.util.Arrays;
import java.util.Collection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import junit.extensions.abbot.ComponentTestFixture;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import abbot.finder.ComponentNotFoundException;
import abbot.finder.MultipleComponentsFoundException;
import abbot.finder.matchers.ClassMatcher;
import abbot.tester.JButtonTester;


@RunWith(Parameterized.class)
public class JCalcParameterTest extends ComponentTestFixture {

	String firstInput;
	String sign;
	String secondInput;
	String comp = "=";
	String result;
	
	JButton button1st = new JButton();
	JButton button2nd = new JButton();
	JButton buttonSign = new JButton();
	JButton buttonComp = new JButton();
	JTextField textFieldOutput = new JTextField();
	JButtonTester bt = new JButtonTester();
		
	@Before 
	public void fixtureSetUp() throws Throwable {
		super.fixtureSetUp();
		setUp(); 
		}
	
	protected void setUp() throws ComponentNotFoundException, MultipleComponentsFoundException {
	   	 JFrame f = new CalculatorFrame("JCalculator");
		 f.setSize(375,275);
		 f.setVisible(true);
		 
		 button1st = createFinder(firstInput);
		 button2nd = createFinder(secondInput);
		 buttonSign = createFinder(sign);
		 buttonComp = createFinder(comp);
		 textFieldOutput = (JTextField) getFinder().find(new ClassMatcher(JTextField.class)); 
	}
	
	private JButton createFinder(String val) throws ComponentNotFoundException, MultipleComponentsFoundException {
		JButton btn = (JButton) getFinder().find(new ClassMatcher(JButton.class) {
			public boolean matches(Component c) { 
					return super.matches(c) && ((JButton) c).getText().equals(val); 
			}
	 });
		return btn;
	}
	
	@After
	public void fixtureTearDown() throws Throwable {
		super.fixtureTearDown();	
	}
		
	public JCalcParameterTest(String firstInput, String sign, String secondInput, String result) {
		this.firstInput = firstInput;
		this.sign = sign;
		this.secondInput = secondInput;
		this.result = result;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> TestInput() {
		return Arrays.asList(new Object[][] {
				{"1", "+", "9", "10"},
				{"2", "*", "8", "16"},
				{"8", "/", "2", "4"},
				{"9", "-", "4", "5"},
				{"5", "/", "0", "Infinity"},
				{"0", "/", "5", "0"},
				{"8", "*", "2", "16"},
				
		});
	}
	
	@Test
	public void testSingleButtonCalcs() throws Exception {
		 bt.actionClick(button1st);
		 bt.actionClick(buttonSign);
		 bt.actionClick(button2nd);
		 bt.actionClick(buttonComp);
		 
		 assertEquals("Ergebnis: ", result, textFieldOutput.getText());
	}
}