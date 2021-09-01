
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex extends JPanel{ 
	private static final long serialVersionUID = 1L;
	private JTabbedPane tpAbas;
	private JButton[] botoes = new JButton[100];
	private JPanel panel;
	private JButton seta;
	private JLabel imagem, nome, acento;
	private JProgressBar Barra;
	private ImageIcon img1, seta_i;
	private ButtonGroup pagamento;
	private JRadioButton dinheiro, cartao;
	private int ing_int, ing_meia;
	private String pagamento_s;
	
	
	public ex(){
		inicializarComponentes();
		DefinirEventos();
	}
	
	private void inicializarComponentes(){
		setLayout(null);
		
		UIManager.put("ProgressBar.background", new Color(224,224,224));
		
	
		img1 = new ImageIcon("demon1.png");
		seta_i =  new ImageIcon("dir.png");
		
		seta = new JButton("");
		seta.setBounds(900, 400, 70,70);
		
		acento = new JLabel("Assentos Ocupados:");
		acento.setBounds(540, 280, 200,70);

		seta.setBackground(Color.black);
	    seta.setIcon(seta_i);
	     
		imagem = new JLabel(img1);
		nome = new JLabel("Formas de pagamento");
		Barra = new JProgressBar();
		
		dinheiro = new JRadioButton("Dinheiro");
		cartao = new JRadioButton("Cartão de Crédito");
		
		pagamento = new ButtonGroup();
		pagamento.add(dinheiro);
		pagamento.add(cartao);
		
		for(int i =0; i<100;i++){
			botoes[i] = new JButton("          ");
			botoes[i].setBackground(Color.green);
			
			
		}
	
		//FlowLayout
		panel = new JPanel(new FlowLayout(1));
		for(int i=0; i<100; i++){
			panel.add(botoes[i]);
			
		}
	
		
		tpAbas = new JTabbedPane();
		tpAbas.addTab("Cinema",panel);
		
		nome.setBounds(200,350,170,30);
		nome.setFont(nome.getFont().deriveFont(16f));
		dinheiro.setBounds(200,400,170,30);
		cartao.setBounds(200,450,170,30);
		
		tpAbas.setBounds(158,-25,870,315);
		Barra.setBounds(168,285,870,20);
		Barra.setBorder(null);
		imagem.setBounds(0,0,168,550);
		panel.setBackground(new Color(242,242,242));
		add(acento);
		add(seta);
		add(nome);
		add(dinheiro);
		add(cartao);
		add(Barra);
		add(imagem);
		add(tpAbas);
		
		
		
		
	}
	
	public void DefinirEventos(){	
	
		
		botoes[0].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[0].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[0].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[0].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[1].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[1].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[1].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[1].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		botoes[2].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[2].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[2].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[2].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[3].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[3].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[3].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[3].setBackground(Color.green);
						Barra.setValue(Barra.getValue() - 1);
						contador = 0;
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[4].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[4].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[4].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[4].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[5].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[5].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[5].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[5].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[6].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[6].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[6].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[6].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);				
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[7].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[7].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[7].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[7].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[8].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[8].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[8].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[8].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[9].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[9].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[9].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[9].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[10].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[10].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[10].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[10].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
					
			}
			});
		
		botoes[11].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[11].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[11].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[11].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[12].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[12].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[12].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[12].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[13].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[13].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[13].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[13].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[14].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[14].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[14].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[14].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[15].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[15].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[15].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[15].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[16].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[16].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[16].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[16].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[17].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[17].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[17].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[17].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[18].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[18].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[18].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[18].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[19].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[19].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[19].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[19].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[20].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[20].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[20].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[20].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[21].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[21].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[21].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[21].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		
		botoes[22].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[22].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[22].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[22].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[23].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[23].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[23].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[23].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[24].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[24].setBackground(Color.red);
						Barra.setValue(Barra.getValue() + 1);
						contador = contador + 1;
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[24].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[24].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[25].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[25].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[25].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[25].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[26].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[26].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[26].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[26].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[27].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[27].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[27].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[27].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[28].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[28].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[28].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[28].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[29].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[29].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[29].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[29].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);					
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[30].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[30].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[30].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[30].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[31].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[31].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[31].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[31].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[32].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[32].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[32].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[32].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[33].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[33].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[33].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[33].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[34].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[34].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[34].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[34].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[35].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[35].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[35].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[35].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[36].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[36].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[36].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[36].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[37].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[37].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[37].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[37].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[38].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[38].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[38].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[38].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[39].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[39].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[39].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[39].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[40].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[40].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[40].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[40].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[41].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[41].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[41].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[41].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);						
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[42].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[42].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[42].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[42].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[43].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[43].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[43].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[43].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[44].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[44].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[44].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[44].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[45].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[45].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[45].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[45].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[46].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[46].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[46].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
						}else if (contador == 2) {
						botoes[46].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[47].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[47].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[47].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[47].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[48].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[48].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[48].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[48].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[49].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[49].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[49].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[49].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[50].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[50].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[50].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[50].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[51].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[51].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[51].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[51].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[52].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[52].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[52].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[52].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[53].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[53].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[53].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[53].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[54].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[54].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[54].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[54].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[55].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[55].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[55].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[55].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[56].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[56].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[56].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[56].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[57].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[57].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[57].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[57].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[58].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[58].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[58].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[58].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[59].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[59].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[59].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[59].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[60].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[60].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[60].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[60].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[61].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[61].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[61].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[61].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[62].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[62].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[62].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[62].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		
		botoes[63].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[63].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[63].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[63].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[64].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[64].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[64].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[64].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[65].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[65].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[65].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[65].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[66].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[66].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[66].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[66].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[67].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[67].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[67].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[67].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[68].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[68].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[68].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[68].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[69].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[69].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[69].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[69].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[70].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[70].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[70].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[70].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[71].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[71].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[71].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[71].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[72].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[72].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[72].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[72].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[73].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[73].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[73].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[73].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[74].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[74].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[74].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[74].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[75].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[75].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[75].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[75].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[76].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[76].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[76].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[76].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[77].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[77].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[77].setBackground(Color.blue);
						contador = contador + 1;		
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[77].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[78].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[78].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[78].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[78].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[79].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[79].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[79].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[79].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[80].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[80].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[80].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[80].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[81].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[81].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[81].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[81].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[82].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[82].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[82].setBackground(Color.blue);
						contador = contador + 1;
					}else if (contador == 2) {
						botoes[82].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[83].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[83].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[83].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[83].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[84].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[84].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[84].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[84].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[85].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[85].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[85].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[85].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[86].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[86].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[86].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[86].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[87].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[87].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[87].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[87].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[88].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[88].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[88].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[88].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[89].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[89].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[89].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[89].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[90].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[90].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[90].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[90].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[91].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[91].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[91].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[91].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() > 80) {
						Barra.setForeground(Color.orange);
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[92].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[92].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[92].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[92].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[93].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[93].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[93].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[93].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[94].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[94].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[94].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[94].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[95].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[95].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[95].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[95].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[96].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[96].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[96].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[96].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[97].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[97].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[97].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[97].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
						
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[98].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[98].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
					}else if (contador == 1) {
						botoes[98].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
					}else if (contador == 2) {
						botoes[98].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
						
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
			}
			});
		
		botoes[99].addActionListener(new ActionListener(){
			int contador = 0;
			public void actionPerformed(ActionEvent arg0){
				
					if (contador == 0){
						botoes[99].setBackground(Color.red);
						contador = contador + 1;
						Barra.setValue(Barra.getValue() + 1);
						ing_int = ing_int + 1;
						
					}else if (contador == 1) {
						botoes[99].setBackground(Color.blue);
						contador = contador + 1;
						ing_meia= ing_meia + 1;
						ing_int = ing_int - 1;
						
					}else if (contador == 2) {
						botoes[99].setBackground(Color.green);
						contador = 0;
						Barra.setValue(Barra.getValue() - 1);
						ing_meia= ing_meia - 1;
					}if (Barra.getValue() == 100) {
						Barra.setForeground(Color.red);
					}else {
						Barra.setForeground(new Color(163,184,204));
					}if(Barra.getValue() == 100) {
						JOptionPane.showMessageDialog(null,"        A sala está cheia!");
					}
					
			}
			});
		
		
		
		seta.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent arg0){
				if(dinheiro.isSelected()){
					pagamento_s = "Dinheiro";
				}
				if(cartao.isSelected()){	
					pagamento_s = "Cartão";
				}
				JOptionPane.showMessageDialog(null,"~ Nota Fiscal\n\n Ingressos inteiros: "+ing_int+"\n Ingressos meia: "+ing_meia+"\n\n A forma de pagamento será: "+pagamento_s);
				JOptionPane.showMessageDialog(null,"Obrigado pelo pedido! Bom filme!");
				System.exit(0);
				
			}
		});
		
		
		
	}

	public static void main(String args[]){
 		JFrame frame = new JFrame("~ CINEMA");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.getContentPane().add(new ex());
		 frame.setBounds(50,50,1038,550);
		 frame.setVisible(true);
	 }
}