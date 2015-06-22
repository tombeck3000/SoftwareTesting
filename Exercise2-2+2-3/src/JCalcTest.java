// Beck; 1329591; Exercise2-2

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import junit.extensions.abbot.ComponentTestFixture;

import org.junit.BeforeClass;
import org.junit.Test;

import abbot.finder.ComponentNotFoundException;
import abbot.finder.MultipleComponentsFoundException;
import abbot.finder.matchers.ClassMatcher;
import abbot.tester.JButtonTester;

public class JCalcTest extends ComponentTestFixture {
	
	public JCalcTest(String name) {super(name); }
	
	JButton button1 = new JButton();
	JButton button9 = new JButton();
	JButton buttonMulti = new JButton();
	JButton buttonPart = new JButton();
	JButton buttonPlus = new JButton();
	JButton buttonComp = new JButton();
	JButton buttonSubtr = new JButton();
	JTextField textFieldOutput = new JTextField();
	JButtonTester bt = new JButtonTester();
	
	@BeforeClass
	protected void setUp() throws ComponentNotFoundException, MultipleComponentsFoundException {
	   	 JFrame f = new CalculatorFrame("JCalculator");
		 f.setSize(375,275);
		 f.setVisible(true);
		 
		 button1 = createFinder("1");
		 button9 = createFinder("9");
		 buttonMulti = createFinder("*");
		 buttonSubtr = createFinder("-");
		 buttonPlus = createFinder("+");
		 buttonPart = createFinder("/");
		 buttonComp = createFinder("=");
		 textFieldOutput = (JTextField) getFinder().find(new ClassMatcher(JTextField.class)); 
	}
	
	private JButton createFinder(String val) throws ComponentNotFoundException, MultipleComponentsFoundException {
		JButton but = (JButton) getFinder().find(new ClassMatcher(JButton.class) {
			public boolean matches(Component c) { 
					return super.matches(c) && ((JButton) c).getText().equals(val); 
			}
	 });
		return but;
	}

	@Test
	public void testAdd() throws Exception {
		
		 bt.actionClick(button9);
		 bt.actionClick(buttonPlus);
		 bt.actionClick(button1);
		 bt.actionClick(buttonComp);
		 
		 assertEquals("Subtraktionsergebnis: ", "10", textFieldOutput.getText());
	}
	
	@Test
	public void testSub() throws Exception {
		
		 bt.actionClick(button9);
		 bt.actionClick(buttonSubtr);
		 bt.actionClick(button1);
		 bt.actionClick(buttonComp);
		 
		 assertEquals("Subtraktionsergebnis: ", "8", textFieldOutput.getText());
	}

	@Test
	public void testMult() throws Exception {
						
		 bt.actionClick(button9);
		 bt.actionClick(buttonMulti);
		 bt.actionClick(button1);
		 bt.actionClick(buttonComp);
		 
		 assertEquals("Multiplikationsergebnis: ", "9", textFieldOutput.getText());
	}
	
	@Test
	public void testDiv() throws Exception {	
	
		 bt.actionClick(button9);
		 bt.actionClick(buttonPart);
		 bt.actionClick(button1);
		 bt.actionClick(buttonComp);
		 
		 assertEquals("Subtraktionsergebnis: ", "9", textFieldOutput.getText());
	}
}
