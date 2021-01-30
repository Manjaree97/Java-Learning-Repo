package Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            throw new IOException();
        } catch (IOException e) {
            // Handle only IO Exception
            // This block will get executed only in case of IOException
        } catch (Exception e) {
            // Handle only all other type of exception
            // This block will get executed in case of all exception except IOException
        } finally {
            System.out.println("This block will get executed no matter exception occur or not");
            try {
                testException(-5);
                testException(-10);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Releasing resources");
            }
//            testException(15);
        }
    }
        public static void testException(int i) throws FileNotFoundException, IOException{
            if(i < 0){
                FileNotFoundException myException = new FileNotFoundException("Negative Integer "+i);
                throw myException;
            }else if(i > 10){
                throw new IOException("Only supported for index 0 to 10");
            }

        }

    }