Author: Michael Ziegler

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javafx.collections.*; 
import javafx.stage.Stage; 


/**
 * class for the dorm and meal plan calculator
 */
public class Skateshop extends JFrame
{
    /**
     * private fields for panels, combo boxes and text field
     */
    private JPanel truckPanel;
    private JPanel deckPanel;
    private JPanel wheelPanel;
    private JPanel miscPanel;
    private JCheckBox miscPanel1;
    private JCheckBox miscPanel2;
    private JCheckBox miscPanel3;
    private JCheckBox miscPanel4;
    private JPanel chargesPanel;
    private JComboBox truckBox;
    private JComboBox deckBox;
    private JComboBox wheelBox;
    private JComboBox miscBox;
    private JFormattedTextField chargeField;

    /**
     * arrays to hold data
     */
    private String[] misc = {"Grip tape","Bearings","Riser pads","Nuts&Bolts kit"};
    private String[] wheels = {"51mm","55mm","58mm","61mm"};
    private String[] decks = {"The Master Thrasher", "The Dictator", "The Street King"};
    private String[] trucks = {"7.75-inch axle", "8-inch axle", "8.5-inch axle"};
    private int[] deckPrices = {60, 45, 50};
    private int[] truckPrices = {35, 40, 45};
    private int[] wheelPrices = {20, 22, 24, 28};
    private int[] miscPrices = {10, 30, 2, 3};
    /**
     * constructor
     */
    public Skateshop()
    {
        super("Skateshop");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        buildDeckPanel();
        buildWheelPanel();
        buildTruckPanel();
        buildMiscPanel();
        buildCostPanel();
        add(truckPanel, BorderLayout.NORTH);
        add(deckPanel, BorderLayout.CENTER);
        add(wheelPanel, BorderLayout.WEST);
    //misc Panel-------------
        miscPanel = new JPanel();  
                    
        miscPanel.add(miscPanel1);
        miscPanel.add(miscPanel2);
        miscPanel.add(miscPanel3);
        miscPanel.add(miscPanel4);
        
        add(miscPanel, BorderLayout.EAST);
    //misc Panel End---------        
        add(chargesPanel, BorderLayout.SOUTH);
        pack();
        setVisible(true);
    }

    /**
     * method that creates the panel, the label and the text field for total cost
     */
    private void buildCostPanel()
    {
        chargesPanel = new JPanel();
        JLabel chargesLabel = new JLabel("Total Cost");
        chargeField = new JFormattedTextField(java.text.NumberFormat.getCurrencyInstance());
        chargeField.setEditable(false);
        chargesPanel.add(chargesLabel);
        chargesPanel.add(chargeField);
        chargeField.setValue((truckPrices[0] + wheelPrices[0] + deckPrices[0] + miscPrices[0]));   //sets initial value for text field
    }

 
    private void buildDeckPanel()
    {
        deckPanel = new JPanel();
        JLabel deckLabel = new JLabel("Decks");
        deckBox = new JComboBox(decks);  
        deckBox.addItemListener(new comboBoxListener());                   
        deckPanel.add(deckLabel);
        deckPanel.add(deckBox);
    }
    

    /**
     * method that creates the panel, label and combo box for selecting a dormitory
     */
    private void buildWheelPanel()
    {
        wheelPanel = new JPanel();
        JLabel wheelLabel = new JLabel("Wheels");
        wheelBox = new JComboBox(wheels);               
        wheelBox.addItemListener(new comboBoxListener());
        wheelPanel.add(wheelLabel);
        wheelPanel.add(wheelBox);
    }
      private void buildTruckPanel()
    {
        truckPanel = new JPanel();
        JLabel truckLabel = new JLabel("Trucks");
        truckBox = new JComboBox(trucks);                 
        truckBox.addItemListener(new comboBoxListener());
        truckPanel.add(truckLabel);
        truckPanel.add(truckBox);
    }
      private void buildMiscPanel()
    {        
        miscPanel1 = new JCheckBox(misc[0]);
        miscPanel1.setVisible(true);
        
        miscPanel2 = new JCheckBox(misc[1]);
        miscPanel2.setVisible(true);
        
        miscPanel3 = new JCheckBox(misc[2]);
        miscPanel3.setVisible(true);
             
        miscPanel4 = new JCheckBox(misc[3]);
        miscPanel4.setVisible(true);
    }

    /**
     * nested class for my item listener
     * listener for all combo boxes to update the text field when changed
     * gets the index numbers of the current selected items in the combo boxes
     * and uses those to get the correct prices from the price arrays
     * then adds them and gets the string value of the result to display in the text field
     */
    private class comboBoxListener implements ItemListener
    {
        public void itemStateChanged(ItemEvent e)
        {
            int deckIndex = deckBox.getSelectedIndex();
            int wheelIndex = wheelBox.getSelectedIndex();
            int truckIndex = truckBox.getSelectedIndex();
            int miscIndex = miscBox.getSelectedIndex();
            int total = (deckPrices[deckIndex] + truckPrices[truckIndex] + wheelPrices[wheelIndex] + miscPrices[miscIndex]);
            chargeField.setValue(1.07*total);
        }
    }


    public static void main(String[] args)
    {
        new Skateshop();
    }
}