package Test;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import IO文件字节输入流.IOTestFinally; //自己写的文件输出包（这行不要写）
/**
 * @author 高哲
 * @version
 * 2018年10月8日 上午8:45:33
 * @copyright
 */
public class Test {
private static final String String = null;
public static void main(String[] args) {
//这是输出效果，不要写
IOTestFinally.showInfo("F:\\java workspace\\测试\\src\\Test\\Test.java");

try {//设置显示效果
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
} catch (ClassNotFoundException | InstantiationException 
		| IllegalAccessException| UnsupportedLookAndFeelException e) {
    e.printStackTrace();
}
for (int i = 0;;i++) { //外层循环控制首选项
Object[] possibleValues = { "可以","不行"}; //用户的选择
int m = JOptionPane.showOptionDialog
	(null, "小姐姐，喜欢你好久了\n做我女朋友好吗？",
		"来自喜欢你的男生   作者：高哲     ", 
		JOptionPane.YES_NO_OPTION,
		JOptionPane.INFORMATION_MESSAGE,
		new ImageIcon("C:\\Users\\TF\\Desktop\\1.gif"),
		possibleValues, possibleValues[0]);  
if(m == 0) {
JOptionPane.showMessageDialog(null, "这才对嘛！别急，后面还有...");
for (int j = 0;; j++) { //内层循环控制输入密码
	String code = JOptionPane.showInputDialog(null,
			"请加我微信\n问我要密码15212625684，"
			+ "不然无法关闭！\n请输入密码","添加微信",
			JOptionPane.PLAIN_MESSAGE);
	if(!("1234").equals(code)) {  //密码错误，就循环运行
		JOptionPane.showMessageDialog(null,("密码不正确！"
				+ "你已经错了"+(j+1)+"次"),"警告！！！",
				JOptionPane.ERROR_MESSAGE);
	}else {                       //密码正确，就跳出循环
		JOptionPane.showMessageDialog(null, "啦啦啦！成功拿下！！！");
		break;
	}
}
		break;
	}else {
		JOptionPane.showMessageDialog(null, "你的选择不正确！", 
			"警告，你选错了"+(i+1)+"次", JOptionPane.ERROR_MESSAGE);
	      }
	}
	    }
}