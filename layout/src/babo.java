import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class babo extends JFrame {
    private JPanel p;
    private JMenuBar mb;
    private JMenu setting, info;
    private JMenuItem sBackgroundColor, sReset, iInfo;
    private JLabel stdInfoLb, nameLb, stdNumLb, stdImg, checkInfoLb, checkLb, returnLb, searchLb;
    private JTextField stdNum, name, search;
    private JTable Table, Table01, Table02;
    String category[] = {"도서명", "저자", "출판사"};
    String category01[] = {"도서명", "출판년도", "출판사"};
    String category02[] = {"도서명", "출판사", "대여일자", "반납일자"};
    DefaultTableModel model, model1, model2;
    JScrollPane tb_sc, tb1_sc, tb2_sc;

    public babo(String title) {
        // 기본 설정
        setTitle(title);
        setSize(1100, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(100, 50);

        p = new JPanel();
        p.setLayout(null);
        add(p);

        // 메뉴바 설정
        mb = new JMenuBar();
        setJMenuBar(mb);

        setting = new JMenu("Setting");
        mb.add(setting);

        sBackgroundColor = new JMenuItem("배경색 변경");
        setting.add(sBackgroundColor);

        sReset = new JMenuItem("초기화");
        setting.add(sReset);

        info = new JMenu("Info");
        mb.add(info);

        iInfo = new JMenuItem("정보");
        info.add(iInfo);

        // 학생 정보 패널
        stdInfoLb = new JLabel("학생 정보");
        stdInfoLb.setBounds(40, 30, 60, 15);
        p.add(stdInfoLb);

        ImageIcon who = new ImageIcon("src/who.jpg");
        stdImg = new JLabel(who);
        stdImg.setBounds(50, 70, 180, 169);
        p.add(stdImg);

        nameLb = new JLabel("학번    : ");
        nameLb.setBounds(250, 78, 200, 20);
        p.add(nameLb);

        stdNum = new JTextField();
        stdNum.setBounds(310, 80, 200, 20);
        p.add(stdNum);

        nameLb = new JLabel("이름    : ");
        nameLb.setBounds(250, 128, 200, 20);
        p.add(nameLb);

        name = new JTextField();
        name.setBounds(310, 130, 200, 20);
        p.add(name);

        // 도서 검색 패널
        checkInfoLb = new JLabel("도서 검색");
        checkInfoLb.setBounds(540, 30, 60, 15);
        p.add(checkInfoLb);

        model = new DefaultTableModel(category, 0);
        Table = new JTable(model);
        tb_sc = new JScrollPane(Table);
        tb_sc.setBounds(600, 50, 350, 400);
		
		
		
		
		
		
		//대여--------------------------------------------------------------------------------------------------------
		checkLb = new JLabel("대여");
		checkLb.setBounds(40, 190, 60, 15);
		p.add(checkLb);
		
		model1 = new DefaultTableModel(category01,0);
		Table01 = new JTable(model1);		
		tb1_sc = new JScrollPane(Table01);
		tb1_sc.setBounds(40,220, 165, 220);
		p.add(tb1_sc);
		
		
		
		//반납--------------------------------------------------------------------------------------------------------
		returnLb = new JLabel("반납");
		returnLb.setBounds(270, 190, 60, 15);
		p.add(returnLb);
		
		model2 = new DefaultTableModel(category02,0);
		Table02 = new JTable(model2);		
		tb2_sc = new JScrollPane(Table02);
		tb2_sc.setBounds(270,220, 220, 220);
		p.add(tb2_sc);
		
		
		
		
		//도서검색--------------------------------------------------------------------------------------------------------
		searchLb = new JLabel("도서검색");
		searchLb.setBounds(40, 480, 60, 15);
		p.add(searchLb);
		search = new JTextField();
		search.setBounds(40, 520, 200, 20);
		p.add(search);
		
		
		
		
		//--------------------------------------------------------------------------------------------------------
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new babo("Library Management System");
	}

}