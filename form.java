package alunos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class form extends JFrame {

	public JPanel contentPane;
	public JTextField textfirstName;
	public JTextField textlastName;
	public JTextField dataNascimento;
	public JTextField email;
	public JTextField cpf;
	public JTextField phone;
	public JTextField add1;
	public JTextField add2;
	public JTextField cep;
	public JTextField city;
	public JTextField state;
	public JTextField country;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form frame = new form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textfirstName = new JTextField();
		textfirstName.setBounds(220, 58, 114, 19);
		contentPane.add(textfirstName);
		textfirstName.setColumns(10);
	
		textlastName = new JTextField();
		textlastName.setBounds(220, 89, 114, 19);
		contentPane.add(textlastName);
		textlastName.setColumns(10);
		
		dataNascimento = new JTextField();
		dataNascimento.setBounds(220, 120, 114, 19);
		contentPane.add(dataNascimento);
		dataNascimento.setColumns(10);
		
		email = new JTextField();
		email.setBounds(220, 151, 114, 19);
		contentPane.add(email);
		email.setColumns(10);
		
		cpf = new JTextField();
		cpf.setBounds(220, 182, 114, 19);
		contentPane.add(cpf);
		cpf.setColumns(10);
		
		phone = new JTextField();
		phone.setBounds(220, 213, 114, 19);
		contentPane.add(phone);
		phone.setColumns(10);

		add1 = new JTextField();
		add1.setBounds(220, 244, 114, 19);
		contentPane.add(add1);
		add1.setColumns(10);
		
		add2 = new JTextField();
		add2.setBounds(220, 275, 114, 19);
		contentPane.add(add2);
		add2.setColumns(10);
		
		cep = new JTextField();
		cep.setBounds(220, 306, 114, 19);
		contentPane.add(cep);
		cep.setColumns(10);
		
		city = new JTextField();
		city.setBounds(220, 337, 114, 19);
		contentPane.add(city);
		city.setColumns(10);
		
		state = new JTextField();
		state.setBounds(220, 368, 114, 19);
		contentPane.add(state);
		state.setColumns(10);
		
		country = new JTextField();
		country.setBounds(220, 399, 114, 19);
		contentPane.add(country);
		country.setColumns(10);
		
		final JComboBox comboTitle = new JComboBox();
		comboTitle.setModel(new DefaultComboBoxModel(new String[] {"", "Mr.", "Mrs.", "Miss.", "Ms.", "Dr.", "Other"}));
		comboTitle.setToolTipText("");
		comboTitle.setBounds(58, 12, 81, 24);
		contentPane.add(comboTitle);
		
		JLabel lblFirstName = new JLabel("First Name *");
		lblFirstName.setBounds(12, 60, 90, 15);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name *");
		lblLastName.setBounds(12, 91, 90, 15);
		contentPane.add(lblLastName);

		JLabel lblDataNascimento = new JLabel("Data Nascimento (DD/MM/AAAA) *");
		lblDataNascimento.setBounds(12, 122, 290, 15);
		contentPane.add(lblDataNascimento);
		
		JLabel lblEmail = new JLabel("Email *");
		lblEmail.setBounds(12, 153, 90, 15);
		contentPane.add(lblEmail);

		JLabel lblCpf = new JLabel("CPF (000.000.000-00) *");
		lblCpf.setBounds(12, 184, 150, 15);
		contentPane.add(lblCpf);

		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(12, 215, 90, 15);
		contentPane.add(lblPhone);

		JLabel lblAdd1 = new JLabel("Address 1");
		lblAdd1.setBounds(12, 246, 90, 15);
		contentPane.add(lblAdd1);

		JLabel lblAdd2 = new JLabel("Address 2");
		lblAdd2.setBounds(12, 277, 90, 15);
		contentPane.add(lblAdd2);

		JLabel lblCep = new JLabel("CEP (00000-00)");
		lblCep.setBounds(12, 308, 90, 15);
		contentPane.add(lblCep);

		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(12, 339, 90, 15);
		contentPane.add(lblCity);

		JLabel lblState = new JLabel("State");
		lblState.setBounds(12, 370, 90, 15);
		contentPane.add(lblState);

		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(12, 401, 90, 15);
		contentPane.add(lblCountry);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setBounds(12, 17, 90, 15);
		contentPane.add(lblTitle);
		
		JLabel lblCamposObrigatorios = new JLabel("*Obrigatorio");
		lblCamposObrigatorios.setBounds(12, 440, 90, 15);
		lblCamposObrigatorios.setForeground(Color.red);
		contentPane.add(lblCamposObrigatorios);
		
		JButton btnPrint = new JButton("Enviar");
		btnPrint.addActionListener(new ActionListener() {
			boolean valido; // variavel para verificacao
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {		
				//contentPane.setVisible(false);
				valido = true;
				print printForm = new print();
				
				// Caso esteja vazio, deixar fundo amarelo
				if(comboTitle.getSelectedItem().toString().equals("")){
					JOptionPane.showMessageDialog(null, "Titulo necessario.");
					comboTitle.setBackground(Color.YELLOW);
					valido = false;
				}
				else {
					printForm.titleLabel.setText((String) comboTitle.getSelectedItem());
					comboTitle.setBackground(Color.WHITE);
				}
				// Caso esteja vazio, deixar fundo amarelo
				if(textfirstName.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Nome necessario.");
					textfirstName.setBackground(Color.YELLOW);
					valido = false;
				}
				else { 
					textfirstName.setBackground(Color.WHITE);
					printForm.firstNameLabel.setText(textfirstName.getText());
				}
				// Caso esteja vazio, deixar fundo amarelo
				if(textlastName.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Sobrenome necessario.");
					textlastName.setBackground(Color.YELLOW);
					valido = false;
				}
				else {
					textlastName.setBackground(Color.WHITE);
					printForm.lastNameLabel.setText(textlastName.getText());
				}
				// Caso esteja vazio, deixar fundo amarelo
				if(dataNascimento.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Data de nascimento necessario.");
					dataNascimento.setBackground(Color.YELLOW);
					valido = false;
				}
				// Caso data de nascimento nao esteja no formato correto, deixar fundo amarelo
				else if(!dataNascimento.getText().matches("\\d{2}/\\d{2}/\\d{4}")){
					JOptionPane.showMessageDialog(null, "Data de nascimento deve ser DD/MM/AAAA.");
					dataNascimento.setBackground(Color.YELLOW);
					valido = false;
				}
				else {
					dataNascimento.setBackground(Color.WHITE);
					printForm.dataNascimentoLabel.setText(dataNascimento.getText());
				}
				// Caso esteja vazio, deixar fundo amarelo
				if(email.getText().equals("")){
					JOptionPane.showMessageDialog(null, "E-mail necessario.");
					email.setBackground(Color.YELLOW);
					valido = false;
				}
				// Caso email nao esteja no formato correto, deixar fundo amarelo
				else if(!email.getText().matches(".+@.+\\.com(.br)?")){
					JOptionPane.showMessageDialog(null, "E-mail invalido");
					email.setBackground(Color.YELLOW);
					valido = false;
				}
				else{
					email.setBackground(Color.WHITE);
					printForm.emailLabel.setText(email.getText());
				}
				// Caso esteja vazio, deixar fundo amarelo
				if(cpf.getText().equals("")){
					JOptionPane.showMessageDialog(null, "CPF necessario.");
					cpf.setBackground(Color.YELLOW);
					valido = false;
				}
				// Caso cpf nao esteja no formato correto, deixar fundo amarelo
				else if(!cpf.getText().matches("\\d{3}.\\d{3}.\\d{3}-\\d{2}")){
					JOptionPane.showMessageDialog(null, "CPF invalido");
					cpf.setBackground(Color.YELLOW);
					valido = false;
				}
				// Caso digito do cpf estiver errado, deixar fundo amarelo
				else if(!verificarDigitoCpf(cpf.getText())){
					JOptionPane.showMessageDialog(null, "CPF invalido");
					cpf.setBackground(Color.YELLOW);
					valido = false;
				}
				else{	
					cpf.setBackground(Color.WHITE);
					printForm.cpfLabel.setText(cpf.getText());
				}
				printForm.phoneLabel.setText(phone.getText());
				printForm.add1Label.setText(add1.getText());
				printForm.add2Label.setText(add2.getText());
				
				// Caso cep nao esteja no formato correto, deixar fundo amarelo
				if(!cep.getText().matches("(\\d{5}-\\d{3})?")){
					JOptionPane.showMessageDialog(null, "CEP invalido");
					cep.setBackground(Color.YELLOW);
					valido = false;
				}
				else {
					cep.setBackground(Color.WHITE);
					printForm.cepLabel.setText(cep.getText());
				}
				printForm.cityLabel.setText(city.getText());
				printForm.stateLabel.setText(state.getText());
				printForm.countryLabel.setText(country.getText());
				
				//printForm.contentPane.setVisible(true);
				if(valido)
					printForm.show();	
			}
		});
		btnPrint.setBounds(12, 470, 74, 25);
		contentPane.add(btnPrint);
	}

	/*
	 * São feitas duas contas para os dois últimos dígitos do CPF.
	 * Para o primeiro dígito verificador:
	 * Soma dos 9 primeiros dígitos, cada um com peso que vai de 1 a 9. 
	 * Depois é efetuada a divisão por 11 e o resto é o dígito.
	 * Para o segundo dígito verificador:
	 * Soma dos 10 primeiros dígitos, cada um com peso que vai de 0 a 9. 
	 * Depois é efetuada a divisão por 11 e o resto é o dígito.
	 * Caso o resto seja 10, o resto é considerado zero.
	 */	
	boolean verificarDigitoCpf(String cpf){
		boolean bool = false;
		int vetor[], x, i, cont, soma1, soma2, dig1, dig2;
		vetor = new int[11];
		/*
		 * Separa a string cpf pelos pontos e tracos e guarda cada digito em uma posicao do vetor.
		 */
		i=0;
		cont=0;
		for(String s : cpf.split("[.-]")){
			x = Integer.parseInt(s);
			/*
			 * Na quarta vez, so havera dois digitos
			 */
			if(cont<3) {
				vetor[i++] = x/100;
				x = x % 100;
				vetor[i++] = x/10;
				vetor[i++] = x % 10;
				cont++;
			}
			else {
				vetor[i++] = x/10;
				vetor[i] = x % 10;
			}
			
		}
		/*
		 * Soma dos 9 primeiros digitos com peso que vai de 1 a 9, dividido por 11. dig1 guarda o resto da divisao.
		 * Soma dos 10 primeiros digitos com peso que vai de 0 a 9, dividido por 11. dig2 guarda o resto da divisao.
		 */
		soma1 = 0;
		soma2 = 0;
		for(i=0;i<9;i++){
			soma1 = soma1 + (i+1) * vetor[i];
			soma2 = soma2 + (i) * vetor[i];
		}
		// Resto da divisao por 11. Caso seja 10, o resto eh zero.		
		dig1 = (soma1 % 11) % 10;
		soma2 = soma2 + i * dig1;
		// Resto da divisao por 11. Caso seja 10, o resto eh zero.
		dig2 = (soma2 % 11) % 10;
		if(dig1==vetor[9] && dig2==vetor[10])
			bool = true;
		
		return bool;
	}
}
