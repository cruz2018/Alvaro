import static org.testng.Assert.assertTrue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JToolBar; 

public class MainFrame extends JFrame {
	
	private TextPanel textPanel;
	private JButton button;
	private Toolbar toolbar;
	
	
	public MainFrame() {
		
		super("Hello Frame");
		
	 	setLayout(new BorderLayout());
		
	 	toolbar = new Toolbar();
	 	// create a objects inside the frame
		button = new JButton("Click Here!");
		textPanel = new TextPanel();
		
		toolbar.setTextPanel(textPanel);
		
		button.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 
				textPanel.appendText("Hello\n"); 
				//assertTrue(textPanel.);
//				assertTrue(button.isVisible());
				//textPanel.setBackground(Color.WHITE);
			}
			   
		}); 
		
		add(toolbar, BorderLayout.NORTH);
		add(textPanel , BorderLayout.CENTER);
		//add(button, BorderLayout.SOUTH);
		for(int i=0;i<1;i++) {
	    	button.doClick();
		}
		textPanel.setAutoscrolls(true);
		textPanel.scrollRectToVisible(getBounds());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setSize(500, 600);
		setVisible(true);
		
	}
}

