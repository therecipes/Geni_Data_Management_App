package com.company.GeniEngine;

import com.company.GeniLayout;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

/**
 * Created by ayettey on 05/10/2016.
 */
public class Engine extends JFrame implements ActionListener {
   protected JPanel subWorkBenchPanel;
    protected Connection connection;
    protected java.sql.Statement statement;
    protected ResultSet resultSet;
    protected ResultSetMetaData setMetaData;
    private String sql;


    GeniLayout object;

    public Engine(GeniLayout object){
        this.object=object;
    }

     int count;
     int itemsCount;
public void actionPerformed(ActionEvent e) {
    Object eventHandler = e.getSource();
    //object.createShowUsertext.setFocusable(true);



    if (eventHandler.equals(object.menuItem[3]) || eventHandler.equals(object.create[0]) ) {

        if(object.menuItem[3].getText().equals("Create Table")){
            object.createTable(true);
            object.create[0].setText("Insert");

        }


        else if(object.create[0].getText().equals("Show")){
            object.createTable(true);
            object.menuItem[0].setText("Create");

        }
        System.out.print(object.create[0].getText());






                   // break;



        System.out.print("" + object.create[0].getText());


    }




        if (eventHandler.equals(object.create[0])) {



                     // if(object.createShowUsertext.getText().equals("")){

                     // JOptionPane.showMessageDialog(null, "Invalid input");
                     // object.createShowUsertext.selectAll();
                     // return;
                    //  }

          //  object.create[0].setVisible(false);

                   //  object.create[0].setText("Insert");

                    System.out.print(object.create[1].getText());

                        count++;
                         //getCreateTableValuesAndCreateTable();
                         //object.createInsertion();
                       // object.craeteAndUpdateLable.setText("Insert Into");
                        //object.createShowUsertext.setVisible(false);
                       // object.createShowUsertext.setText("");





                getInsertionValues();




        }




            //  if(object.createShowUsertext.getText().equals("")){

            //  JOptionPane.showMessageDialog(null, "Invalid input");
            // object.createShowUsertext.selectAll();
            //  return;
            //  }



            //JOptionPane.showMessageDialog(null, "Invalid input");


        }













    public void getCreateTableValuesAndCreateTable(){

        final String texValues=object.createShowUsertext.getText();
        final String createTable="CREATE TABLE " +  texValues;
        System.out.print(texValues + createTable);

        try{
            Class.forName("com.mysql.jdbc.Driver");

            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "0000");

            statement=connection.createStatement();

            statement.executeUpdate(createTable);




        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

}



public void getInsertionValues(){
    final String texValues=object.createShowUsertext.getText();

    final String createTable="INSERT INTO " +  texValues;
    System.out.print(texValues + createTable);

    try{
        Class.forName("com.mysql.jdbc.Driver");

        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "0000");

        statement=connection.createStatement();

        statement.executeUpdate(createTable);




    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException e) {
        e.printStackTrace();
    }

}




}

