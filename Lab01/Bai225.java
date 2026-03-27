import javax.swing.JOptionPane;

public class Bai225 {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "Kết quả các phép tính:\n";

        // Nhập số thứ nhất
        strNum1 = JOptionPane.showInputDialog(null, 
                  "Hãy nhập số thứ nhất (double):", "Nhập số liệu", 
                  JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);

        // Nhập số thứ hai
        strNum2 = JOptionPane.showInputDialog(null, 
                  "Hãy nhập số thứ hai (double):", "Nhập số liệu", 
                  JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        // Thực hiện các phép tính
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        
        strNotification += "Tổng: " + sum + "\n";
        strNotification += "Hiệu: " + difference + "\n";
        strNotification += "Tích: " + product + "\n";

        // Kiểm tra số chia để thực hiện phép thương
        if (num2 != 0) {
            double quotient = num1 / num2;
            strNotification += "Thương: " + quotient;
        } else {
            strNotification += "Thương: Không thể thực hiện (số chia bằng 0)";
        }

        // Hiển thị kết quả
        JOptionPane.showMessageDialog(null, strNotification, 
                  "Kết quả", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}