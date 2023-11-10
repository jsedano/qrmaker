package dev.jsedano.qrmaker;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class QrmakerApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplicationBuilder builder = new SpringApplicationBuilder(QrmakerApplication.class);
    builder.headless(false);
    ConfigurableApplicationContext context = builder.run(args);
  }

  @Override
  public void run(String... args) throws Exception {
    String qrToShow =
        JOptionPane.showInputDialog(
            null, "Introduce el texto a encodear", "Crea un QR", JOptionPane.QUESTION_MESSAGE);
    JOptionPane.showMessageDialog(
        null,
        "",
        "QR",
        JOptionPane.INFORMATION_MESSAGE,
        new ImageIcon(new QRCreator().unsafeCreateQRImage(qrToShow, 500)));
  }
}
