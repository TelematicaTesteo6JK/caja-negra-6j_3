/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author acer all in one
 */
public class ObtieneRendimiento {
    public float obtiene_rendimiento(float balance)
    {
        float rendimiento;
        if(balance>=0 && balance < 1000)
            rendimiento=balance+balance*0.1f;
        else if(balance >=1000 && balance <= 10000)
            rendimiento=balance+balance*0.3f;
        else if(balance >10000)
        {
            rendimiento=balance+balance*0.5f;
        }
        else
        {
            rendimiento=0;
        }
            
        return rendimiento;
    }
    
}
