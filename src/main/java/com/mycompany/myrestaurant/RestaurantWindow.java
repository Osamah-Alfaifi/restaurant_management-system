
package com.mycompany.myrestaurant;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RestaurantWindow extends javax.swing.JFrame {
int chickenNum , meatNum , waterNum , juiceNum ;
double chickenPrice, meatPrice , waterPrice , juicePrice;
final double CHICKEN_COST = 4.0 , MEAT_COST = 4.0 , WATER_COST = 1.0 , JUICE_COST = 3.0 ;
double subtotal , vat , total ; 
int customerCounter;
PrintWriter output ;

        
        
    
    public RestaurantWindow() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        chickenCounter = new javax.swing.JSpinner();
        chickenCheese = new javax.swing.JCheckBox();
        chickenPriceLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        meatCounter = new javax.swing.JSpinner();
        meatCheese = new javax.swing.JCheckBox();
        meatPriceLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        waterCounter = new javax.swing.JSpinner();
        waterPriceLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        juiceCounter = new javax.swing.JSpinner();
        juicePriceLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        subTotalLabel = new javax.swing.JLabel();
        vatLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        calculateBill = new javax.swing.JButton();
        saveBill = new javax.swing.JButton();
        newBill = new javax.swing.JButton();
        customerCounterLabel = new javax.swing.JLabel();
        exit = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("نظام ادارة مطاعم ");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "المأكولات\n", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("شاورما دجاج");

        chickenCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        chickenCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chickenCounterStateChanged(evt);
            }
        });

        chickenCheese.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        chickenCheese.setText("جبنة");
        chickenCheese.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        chickenCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickenCheeseActionPerformed(evt);
            }
        });

        chickenPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chickenPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chickenPriceLabel.setText("0.0 ريال ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("شاورما لحم");

        meatCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        meatCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                meatCounterStateChanged(evt);
            }
        });

        meatCheese.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        meatCheese.setText("جبنة");
        meatCheese.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        meatCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meatCheeseActionPerformed(evt);
            }
        });

        meatPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        meatPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        meatPriceLabel.setText("0.0 ريال ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(chickenPriceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chickenCheese))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(meatPriceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(meatCheese)))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(meatCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(chickenCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(meatCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(meatCheese)
                        .addComponent(meatPriceLabel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(chickenCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chickenCheese)
                            .addComponent(chickenPriceLabel))
                        .addGap(57, 57, 57)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "المشروبات\n\n", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("ماء");
        jLabel7.setBorder(null);
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        waterCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        waterCounter.setBorder(null);
        waterCounter.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        waterCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                waterCounterStateChanged(evt);
            }
        });

        waterPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        waterPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        waterPriceLabel.setText("0.0 ريال ");
        waterPriceLabel.setBorder(null);
        waterPriceLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("عصير");
        jLabel9.setBorder(null);
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        juiceCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        juiceCounter.setBorder(null);
        juiceCounter.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        juiceCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                juiceCounterStateChanged(evt);
            }
        });

        juicePriceLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        juicePriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        juicePriceLabel.setText("0.0 ريال ");
        juicePriceLabel.setBorder(null);
        juicePriceLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(juicePriceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(juiceCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(41, 41, 41)
                .addComponent(waterPriceLabel)
                .addGap(18, 18, 18)
                .addComponent(waterCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(waterCounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(waterPriceLabel)
                    .addComponent(jLabel9)
                    .addComponent(juiceCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(juicePriceLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        waterPriceLabel.getAccessibleContext().setAccessibleParent(waterPriceLabel);
        jLabel9.getAccessibleContext().setAccessibleParent(waterPriceLabel);
        juiceCounter.getAccessibleContext().setAccessibleParent(waterPriceLabel);
        juicePriceLabel.getAccessibleContext().setAccessibleParent(waterPriceLabel);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "الحساب\n\n\n", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        subTotalLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        subTotalLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        subTotalLabel.setText("المجموع :   0.0 ريال");

        vatLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vatLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        vatLabel.setText("الضريبة :   0.0 ريال");

        totalLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totalLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalLabel.setText("الاجمالي :   0.0 ريال");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subTotalLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vatLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(subTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "الحساب\n\n\n", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        calculateBill.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        calculateBill.setText("الحساب");
        calculateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBillActionPerformed(evt);
            }
        });

        saveBill.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveBill.setText("حفظ الفاتورة");
        saveBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBillActionPerformed(evt);
            }
        });

        newBill.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newBill.setText("فاتورة جديدة");
        newBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(calculateBill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newBill)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveBill)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calculateBill, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBill, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newBill, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        customerCounterLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        customerCounterLabel.setText("رقم الفاتورة: 0 ");

        exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit.setText("خروج");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(exit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(customerCounterLabel)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addGap(161, 161, 161))
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(customerCounterLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    
    
    private void chickenCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickenCheeseActionPerformed
        
       if( chickenCheese.isSelected() ){
            chickenPrice += chickenNum ;
       } else{
            chickenPrice -= chickenNum ;
       }
       chickenPriceLabel.setText(chickenPrice + "ريال" );
        
    }//GEN-LAST:event_chickenCheeseActionPerformed

    private void meatCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meatCheeseActionPerformed
        if( meatCheese.isSelected() ){
           meatPrice += meatNum ;
       } else{
            meatPrice -= meatNum ;
       }
      meatPriceLabel.setText(meatPrice + "ريال" );
    }//GEN-LAST:event_meatCheeseActionPerformed

    private void calculateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBillActionPerformed
        
         subtotal=  chickenPrice+ meatPrice + waterPrice + juicePrice;
        subTotalLabel.setText("المجموع " + subtotal + " ريال");
        vat = subtotal *0.15 ; 
        vatLabel.setText("الضريبة " + vat + " ريال");
        total = subtotal + vat ;
        totalLabel.setText("الاجمالي " + total + " ريال");
        
    }//GEN-LAST:event_calculateBillActionPerformed

    private void saveBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBillActionPerformed
        
    try {
        if(total != 0){
        output= new PrintWriter("bill. " + customerCounter + ".txt" );
        output.println( "رقم الفاتورة  " + customerCounter );
        output.println("=============");
        
        if(chickenNum != 0){
            output.print(chickenNum + "شاورما دجاج   ");
            if(chickenCheese.isSelected()){
                output.print(" مع الجبنة ");
            }
            
            output.println(chickenPrice + "ريال  ");
        }
        if (meatNum != 0){
         output.print( meatNum+ "شاورما لحم  ");
         if(meatCheese.isSelected()){
                output.print(" مع الجبنة ");
        }
          output.println(meatPrice + "ريال  ");
        }
        if(waterNum != 0){
        output.print( waterNum +  " ماء "  );
             output.println( waterPrice + "ريال " );
            
        }
         if(juiceNum != 0){
            output.print(juiceNum+" عصير ");
             output.println(juicePrice+" ريال ");
        
        }
            output.println("=============");
               output.println("المجموع :" + subtotal + " ريال " );
               output.println("الضريبة :" + vat + " ريال " );
               output.println("الاجمالي : " + total + " ريال " );
               output.println( );
               output.println("***شكرا لطلبك ***" );
        
        
        }
        output.close();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(RestaurantWindow.class.getName())
                .log(Level.SEVERE, null, ex);
    }
    
    }//GEN-LAST:event_saveBillActionPerformed

    private void newBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBillActionPerformed
        if(total != 0 ){
            chickenCounter.setValue(0);
            meatCounter.setValue(0);
            waterCounter.setValue(0);
            juiceCounter.setValue(0);
             chickenCheese.setSelected(false);
             meatCheese.setSelected(false);
             subTotalLabel.setText("المجموع : 0.0 ريال");
             vatLabel.setText("الضريبة : 0.0 ريال");
             totalLabel.setText("الاجمالي: 0.0 ريال");
             subtotal = 0;
             vat=0 ;
             total=0 ;
             customerCounter++;
             customerCounterLabel.setText(" رقم الفاتورة : " +customerCounter );
             
             
             
             
        }
    }//GEN-LAST:event_newBillActionPerformed

    private void chickenCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chickenCounterStateChanged
       chickenNum = (Integer) chickenCounter.getValue();
        chickenPrice = CHICKEN_COST*chickenNum;
        chickenPriceLabel.setText(chickenPrice + "ريال" );

    }//GEN-LAST:event_chickenCounterStateChanged

    private void meatCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_meatCounterStateChanged
       meatNum = (Integer) meatCounter.getValue();
        meatPrice = MEAT_COST*meatNum;
       meatPriceLabel.setText(meatPrice + "ريال" );
    }//GEN-LAST:event_meatCounterStateChanged

    private void waterCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_waterCounterStateChanged
       waterNum = (Integer) waterCounter.getValue();
       waterPrice = WATER_COST*waterNum;
      waterPriceLabel.setText(waterPrice + "ريال" );
    }//GEN-LAST:event_waterCounterStateChanged

    private void juiceCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_juiceCounterStateChanged
       juiceNum = (Integer) juiceCounter.getValue();
      juicePrice = JUICE_COST*juiceNum;
     juicePriceLabel.setText(juicePrice + "ريال" );
    }//GEN-LAST:event_juiceCounterStateChanged

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed


    public static void main(String args[]) {
        
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurantWindow().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateBill;
    private javax.swing.JCheckBox chickenCheese;
    private javax.swing.JSpinner chickenCounter;
    private javax.swing.JLabel chickenPriceLabel;
    private javax.swing.JLabel customerCounterLabel;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSpinner juiceCounter;
    private javax.swing.JLabel juicePriceLabel;
    private javax.swing.JCheckBox meatCheese;
    private javax.swing.JSpinner meatCounter;
    private javax.swing.JLabel meatPriceLabel;
    private javax.swing.JButton newBill;
    private javax.swing.JButton saveBill;
    private javax.swing.JLabel subTotalLabel;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel vatLabel;
    private javax.swing.JSpinner waterCounter;
    private javax.swing.JLabel waterPriceLabel;
    // End of variables declaration//GEN-END:variables
}
