import javax.swing.text.View;
import java.awt.event.ActionEvent;

public class ViewChange implements java.awt.event.ActionListener {
    /*
     * 这一部分是因为我把界面和动作分开成两个类来写了才需要进行对象的传递如果动作和界面在一个对象中写的话就不需要传入对象了
     */
    //View v = new View();//先定义一个View对象在切换界面的时候会使用到

    //public ViewChange(View v)//将外界的View对象传入这个类里
   // {
     //   this.v = v;
   // }

    public void actionPerformed(ActionEvent event) {
        Object object = event.getSource();//创建事件源对象
        switch (event.getActionCommand()) {
            //如果按下视图1
            case "视图1":
                //这里之所以先创建新视图再关闭旧视图是因为反过来的话我们会发现延迟看上去会有一些难受
           //     new View().view();//new一个View类并调用里面的view函数
             //   v.setVisible(false);//关闭穿进来的那个类的视图
                break;
            //如果按下视图2
            case "视图2":
                //new View().view2();
               // v.setVisible(false);
        }
    }

}

