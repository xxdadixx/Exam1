import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class AnimalGeneratorWindow {
  
  public static void main(String[] args) {
	// สร้างจอแสดงผลและเชลล์ (หน้าต่างหลัก)
    Display display = new Display();
    Shell shell = new Shell(display);
    shell.setSize(450, 320);
    shell.setText("โปรแกรมสุ่มสัตว์");
    
    // สร้าง label สำหรับชื่อสัตว์
    Label nameLabel = new Label(shell, SWT.NONE);
    nameLabel.setBounds(10, 10, 414, 15);
    
    // สร้าง label สำหรับคำอธิบายสัตว์
    Label descriptionLabel = new Label(shell, SWT.NONE);
    descriptionLabel.setBounds(10, 35, 414, 15);
    
    // สร้างพื้นที่ข้อความสำหรับบันทึกใน log
    Text logText = new Text(shell, SWT.BORDER | SWT.READ_ONLY | SWT.V_SCROLL | SWT.H_SCROLL);
    logText.setBounds(10, 60, 414, 180);
    
    // สร้างปุ่ม "สุ่ม"
    Button btnNewAnimal = new Button(shell, SWT.NONE);
    btnNewAnimal.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
    	// เมื่อกดปุ่ม "สุ่ม"
        Animal randomAnimal = AnimalGenerator.getRandomAnimal();
        
        // อัปเดตชื่อและคำอธิบายด้วยข้อมูลสัตว์ใหม่
        nameLabel.setText("ชื่อ: " + randomAnimal.getName());
        descriptionLabel.setText("คำอธิบาย: " + randomAnimal.getDescription());
        
        // ต่อท้ายข้อมูลสัตว์ใหม่ลงใน log
        logText.append("ชื่อ: " + randomAnimal.getName() + "\n");
        logText.append("คำอธิบาย: " + randomAnimal.getDescription() + "\n");
      }
    });
    btnNewAnimal.setBounds(10, 250, 414, 25);
    btnNewAnimal.setText("สุ่ม");

    // เปิดเชลล์และเริ่มลูป event
    shell.open();
    while (!shell.isDisposed()) {
      if (!display.readAndDispatch()) {
        display.sleep();
      }
    }
    display.dispose();
  }
}
