/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TemperatureConverter;

import javax.swing.ButtonGroup;

/**
 *
 * @author jehow
 */
public class TemperatureConverter extends javax.swing.JFrame {

    /**
     * Creates new form TemperatureConverter
     */
    public TemperatureConverter() {
        initComponents();
        ButtonGroup inTempbtn = new ButtonGroup();
        ButtonGroup outTempbtn = new ButtonGroup();
        outTempbtn.add(btnToCelcius);
        outTempbtn.add(btnToFahrenheit);
        outTempbtn.add(btnToKelvin);
        inTempbtn.add(btnFromCelcius);
        inTempbtn.add(btnFromFahrenheit);
        inTempbtn.add(btnFromKelvin);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFromFahrenheit = new javax.swing.JRadioButton();
        btnFromCelcius = new javax.swing.JRadioButton();
        btnFromKelvin = new javax.swing.JRadioButton();
        btnToFahrenheit = new javax.swing.JRadioButton();
        btnToCelcius = new javax.swing.JRadioButton();
        btnToKelvin = new javax.swing.JRadioButton();
        lblEnterTemp = new javax.swing.JLabel();
        lblConvertFrom = new javax.swing.JLabel();
        lblConvert = new javax.swing.JLabel();
        lblNewTemp = new javax.swing.JLabel();
        lblOut = new javax.swing.JLabel();
        tfInTemp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnFromFahrenheit.setText("Fahrenheit");

        btnFromCelcius.setText("Celcius");

        btnFromKelvin.setText("Kelvin");

        btnToFahrenheit.setText("Fahrenheit");

        btnToCelcius.setText("Celcius");

        btnToKelvin.setText("Kelvin");

        lblEnterTemp.setText("Enter Numeric Temperature:");

        lblConvertFrom.setText("Convert from:");

        lblConvert.setText("Convert to:");

        lblNewTemp.setText("Comparable Temperature is:");

        lblOut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfInTemp.setText("0");
        tfInTemp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfInTempKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfInTempKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfInTempKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEnterTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFromFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnToFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFromCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnFromKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnToCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnToKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNewTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addComponent(tfInTemp)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(lblConvertFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(304, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(lblConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(304, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFromFahrenheit)
                    .addComponent(btnFromCelcius)
                    .addComponent(btnFromKelvin))
                .addGap(18, 18, 18)
                .addComponent(lblEnterTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfInTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnToFahrenheit)
                    .addComponent(btnToCelcius)
                    .addComponent(btnToKelvin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNewTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOut, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(lblConvertFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(253, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(162, Short.MAX_VALUE)
                    .addComponent(lblConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(107, 107, 107)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfInTempKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfInTempKeyTyped
        // TODO add your handling code here:
        int inTemp = 0;
        if (tfInTemp.getText().equals("")) {
            lblOut.setText("Please enter a temperature.");
        } else {
            try {
                inTemp = Integer.parseInt(tfInTemp.getText());
            } catch (NumberFormatException e1) {
                lblOut.setText("Enter a valid number for the temp.");
                inTemp = 0;
                return;
            }
        }
        if(!(btnFromCelcius.isSelected() || btnFromFahrenheit.isSelected() || btnFromKelvin.isSelected()) || !(btnToCelcius.isSelected() || btnToFahrenheit.isSelected() || btnToKelvin.isSelected())){
            lblOut.setText("Please select a to and from conversion temp");
            return;
        }
        
        if (btnFromCelcius.isSelected()) {
            if (btnToCelcius.isSelected()) {
                lblOut.setText(String.valueOf(inTemp));
            } else if (btnToFahrenheit.isSelected()) {
                lblOut.setText(String.valueOf(1.8*inTemp + 32));
            } else if (btnToKelvin.isSelected()) {
                lblOut.setText(String.valueOf(inTemp + 273.15));
            }
        } else if (btnFromFahrenheit.isSelected()) {
            if (btnToCelcius.isSelected()) {
                lblOut.setText(String.valueOf((inTemp-32)/1.8));
            } else if (btnToFahrenheit.isSelected()) {
                lblOut.setText(String.valueOf(inTemp));
            } else if (btnToKelvin.isSelected()) {
                lblOut.setText(String.valueOf((inTemp - 32) * 5/9 + 273.15));
            }
        } else if (btnFromKelvin.isSelected()) {
            if (btnToCelcius.isSelected()) {
                lblOut.setText(String.valueOf(inTemp - 273.15));
            } else if (btnToFahrenheit.isSelected()) {
                lblOut.setText(String.valueOf((inTemp- 273.15) * 9/5 + 32));
            } else if (btnToKelvin.isSelected()) {
                lblOut.setText(String.valueOf(inTemp));
            }
        }

    }//GEN-LAST:event_tfInTempKeyTyped
/*
    private void tfInTempKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfInTempKeyPressed
        int inTemp = 0;
        if (tfInTemp.getText().equals("")) {
            lblOut.setText("Please enter a temperature.");
        } else {
            try {
                inTemp = Integer.parseInt(tfInTemp.getText());
            } catch (NumberFormatException e1) {
                lblOut.setText("Enter a valid number for the temp.");
                return;
            }
        }
        if(!(btnFromCelcius.isSelected() || btnFromFahrenheit.isSelected() || btnFromKelvin.isSelected()) || !(btnToCelcius.isSelected() || btnToFahrenheit.isSelected() || btnToKelvin.isSelected())){
            lblOut.setText("Please select a to and from conversion temp");
            return;
        }
        
        if (btnFromCelcius.isSelected()) {
            if (btnToCelcius.isSelected()) {
                lblOut.setText(String.valueOf(inTemp));
            } else if (btnToFahrenheit.isSelected()) {
                lblOut.setText(String.valueOf(1.8*inTemp + 32));
            } else if (btnToKelvin.isSelected()) {
                lblOut.setText(String.valueOf(inTemp + 273.15));
            }
        } else if (btnFromFahrenheit.isSelected()) {
            if (btnToCelcius.isSelected()) {
                lblOut.setText(String.valueOf((inTemp-32)/1.8));
            } else if (btnToFahrenheit.isSelected()) {
                lblOut.setText(String.valueOf(inTemp));
            } else if (btnToKelvin.isSelected()) {
                lblOut.setText(String.valueOf((inTemp - 32) * 5/9 + 273.15));
            }
        } else if (btnFromKelvin.isSelected()) {
            if (btnToCelcius.isSelected()) {
                lblOut.setText(String.valueOf(inTemp - 273.15));
            } else if (btnToFahrenheit.isSelected()) {
                lblOut.setText(String.valueOf((inTemp- 273.15) * 9/5 + 32));
            } else if (btnToKelvin.isSelected()) {
                lblOut.setText(String.valueOf(inTemp));
            }
        }
    }//GEN-LAST:event_tfInTempKeyPressed

    private void tfInTempKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfInTempKeyReleased
        int inTemp = 0;
        if (tfInTemp.getText().equals("")) {
            lblOut.setText("Please enter a temperature.");
        } else {
            try {
                inTemp = Integer.parseInt(tfInTemp.getText());
            } catch (NumberFormatException e1) {
                lblOut.setText("Enter a valid number for the temp.");
                inTemp = 0;
                return;
            }
        }
        if(!(btnFromCelcius.isSelected() || btnFromFahrenheit.isSelected() || btnFromKelvin.isSelected()) || !(btnToCelcius.isSelected() || btnToFahrenheit.isSelected() || btnToKelvin.isSelected())){
            lblOut.setText("Please select a to and from conversion temp");
            return;
        }
        
        if (btnFromCelcius.isSelected()) {
            if (btnToCelcius.isSelected()) {
                lblOut.setText(String.valueOf(inTemp));
            } else if (btnToFahrenheit.isSelected()) {
                lblOut.setText(String.valueOf(1.8*inTemp + 32));
            } else if (btnToKelvin.isSelected()) {
                lblOut.setText(String.valueOf(inTemp + 273.15));
            }
        } else if (btnFromFahrenheit.isSelected()) {
            if (btnToCelcius.isSelected()) {
                lblOut.setText(String.valueOf((inTemp-32)/1.8));
            } else if (btnToFahrenheit.isSelected()) {
                lblOut.setText(String.valueOf(inTemp));
            } else if (btnToKelvin.isSelected()) {
                lblOut.setText(String.valueOf((inTemp - 32) * 5/9 + 273.15));
            }
        } else if (btnFromKelvin.isSelected()) {
            if (btnToCelcius.isSelected()) {
                lblOut.setText(String.valueOf(inTemp - 273.15));
            } else if (btnToFahrenheit.isSelected()) {
                lblOut.setText(String.valueOf((inTemp- 273.15) * 9/5 + 32));
            } else if (btnToKelvin.isSelected()) {
                lblOut.setText(String.valueOf(inTemp));
            }
        }
    }//GEN-LAST:event_tfInTempKeyReleased
*/

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TemperatureConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemperatureConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemperatureConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemperatureConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TemperatureConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnFromCelcius;
    private javax.swing.JRadioButton btnFromFahrenheit;
    private javax.swing.JRadioButton btnFromKelvin;
    private javax.swing.JRadioButton btnToCelcius;
    private javax.swing.JRadioButton btnToFahrenheit;
    private javax.swing.JRadioButton btnToKelvin;
    private javax.swing.JLabel lblConvert;
    private javax.swing.JLabel lblConvertFrom;
    private javax.swing.JLabel lblEnterTemp;
    private javax.swing.JLabel lblNewTemp;
    private javax.swing.JLabel lblOut;
    private javax.swing.JTextField tfInTemp;
    // End of variables declaration//GEN-END:variables
}
