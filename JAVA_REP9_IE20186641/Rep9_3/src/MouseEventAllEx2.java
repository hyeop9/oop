import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventAllEx2 extends JFrame {
    JLabel la = new JLabel(" Move Me");

    MouseEventAllEx2() {
        setTitle("MouseListener와 MouseMotionListener 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        MyMouseListener listener = new MyMouseListener(); // 마우스/모션 리스너 객체 생성
        c.addMouseListener(listener); // MouseListener 리스너 등록
        c.addMouseMotionListener(listener); // MouseMotionListener 리스너 등록

        c.setLayout(null); // 배치 관리자를 삭제하여 레이블을 마음대로 움직일 수 있게 함
        la.setFont(new Font("맑은 고딕", Font.BOLD, 20)); // 문자열의 위치 지정
        la.setSize(100, 30);
        la.setLocation(100, 80);
        c.add(la); // 레이블 컴포넌트 삽입

        setSize(500, 500);
        setVisible(true);
    }

    // Mouse 리스너와 MouseMotion 리스너를 모두 가진 리스너 구현
    class MyMouseListener implements MouseListener, MouseMotionListener {
        // MouseListener 의 5개 메소드 구현
        public void mousePressed(MouseEvent e) {
            la.setLocation(e.getX(), e.getY()); // 마우스가 눌러진 위치로 레이블 이동
            setTitle("mousePressed(" + e.getX() + "," + e.getY() + ")"); // 눌러진 위치 출력

            if (e.getButton() == MouseEvent.BUTTON1) {
                System.out.println("왼쪽 버튼이 클릭되었습니다...");
            }
            if (e.getButton() == MouseEvent.BUTTON3) {
                System.out.println("오른쪽 버튼이 클릭되었습니다...");
            }
        }

        public void mouseReleased(MouseEvent e) {
            la.setLocation(e.getX(), e.getY()); // 마우스가 눌러진 위치로 레이블 이동
            setTitle("mouseReleased(" + e.getX() + "," + e.getY() + ")"); // 떼어진 위치 출력
        }

        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2) {
                int r = (int) (Math.random() * 256);
                int g = (int) (Math.random() * 256);
                int b = (int) (Math.random() * 256);
                JPanel p = (JPanel) e.getSource();
                p.setBackground(new Color(r, g, b));
            }
        }

        public void mouseEntered(MouseEvent e) {
            Component comp = (Component) e.getSource();
            comp.setBackground(Color.CYAN); // 마우스가 올라간 곳 색 변경
        }

        public void mouseExited(MouseEvent e) {
            Component comp = (Component) e.getSource();
            comp.setBackground(Color.RED); // 마우스가 내려간 곳 색 변경
        }

        // MouseMotionListener 의 2개 메소드 구현
        public void mouseDragged(MouseEvent e) { // 마우스가 드래깅되는 동안 계속 호출
            la.setLocation(e.getX(), e.getY());
            setTitle("mouseDragged(" + e.getX() + "," + e.getY() + ")"); // 드레깅 위치 출력
            System.out.println("마우스 드래그중...");
        }

        public void mouseMoved(MouseEvent e) { // 마우스가 움직이는 동안 계속 호출
            la.setLocation(e.getX(), e.getY());
            setTitle("mouseMoved (" + e.getX() + "," + e.getY() + ")"); // 무브 위치 출력
        }
    }

    public static void main(String[] args) {
        new MouseEventAllEx2();
    }
}
