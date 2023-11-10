package dev.jsedano.qrmaker;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.zxing.WriterException;
import java.awt.image.BufferedImage;
import java.io.IOException;
import org.junit.jupiter.api.Test;

public class QRCreatorTest {

  @Test
  public void testUnsafeCreateQRImage() throws WriterException, IOException {
    QRCreator qrCreator = new QRCreator();
    BufferedImage bi = qrCreator.unsafeCreateQRImage("content", 100);
    assertEquals(100, bi.getWidth());
    assertEquals(100, bi.getHeight());
  }
}
