/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacamp.thirdLessonWork.homeWork2.interfaces;

/**
 *
 * @author seyma.deniz
 */
public class MySqlCustomerDal implements ICustomerDal {

    @Override
    public void add() {
        System.out.println("MySql ile eklendi.");
    }

}
