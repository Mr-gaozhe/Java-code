package Test;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import IO�ļ��ֽ�������.IOTestFinally; //�Լ�д���ļ�����������в�Ҫд��
/**
 * @author ����
 * @version
 * 2018��10��8�� ����8:45:33
 * @copyright
 */
public class Test {
private static final String String = null;
public static void main(String[] args) {
//�������Ч������Ҫд
IOTestFinally.showInfo("F:\\java workspace\\����\\src\\Test\\Test.java");

try {//������ʾЧ��
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
} catch (ClassNotFoundException | InstantiationException 
		| IllegalAccessException| UnsupportedLookAndFeelException e) {
    e.printStackTrace();
}
for (int i = 0;;i++) { //���ѭ��������ѡ��
Object[] possibleValues = { "����","����"}; //�û���ѡ��
int m = JOptionPane.showOptionDialog
	(null, "С��㣬ϲ����þ���\n����Ů���Ѻ���",
		"����ϲ���������   ���ߣ�����     ", 
		JOptionPane.YES_NO_OPTION,
		JOptionPane.INFORMATION_MESSAGE,
		new ImageIcon("C:\\Users\\TF\\Desktop\\1.gif"),
		possibleValues, possibleValues[0]);  
if(m == 0) {
JOptionPane.showMessageDialog(null, "��Ŷ���𼱣����滹��...");
for (int j = 0;; j++) { //�ڲ�ѭ��������������
	String code = JOptionPane.showInputDialog(null,
			"�����΢��\n����Ҫ����15212625684��"
			+ "��Ȼ�޷��رգ�\n����������","���΢��",
			JOptionPane.PLAIN_MESSAGE);
	if(!("1234").equals(code)) {  //������󣬾�ѭ������
		JOptionPane.showMessageDialog(null,("���벻��ȷ��"
				+ "���Ѿ�����"+(j+1)+"��"),"���棡����",
				JOptionPane.ERROR_MESSAGE);
	}else {                       //������ȷ��������ѭ��
		JOptionPane.showMessageDialog(null, "���������ɹ����£�����");
		break;
	}
}
		break;
	}else {
		JOptionPane.showMessageDialog(null, "���ѡ����ȷ��", 
			"���棬��ѡ����"+(i+1)+"��", JOptionPane.ERROR_MESSAGE);
	      }
	}
	    }
}