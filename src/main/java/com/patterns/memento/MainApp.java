package com.patterns.memento;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MainApp extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		new MainApp();
		
	}
	
	private JButton undo,redo,save;
	private JTextArea article = new JTextArea(40,60);
	
	CareTaker careTaker = new CareTaker();
	Originator originator = new Originator();
	
	int saveFile = 0, currentArticle = 0;
	
	public MainApp() {
		
		this.setSize(750, 780);
		this.setTitle("Memento Design Pattern");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel jPanel = new JPanel();
		jPanel.add(new JLabel("Article"));
		jPanel.add(article);
		
		save = new JButton("Save");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		
		undo.setEnabled(false);
		redo.setEnabled(false);
		
		save.addActionListener(e -> {
			
			String textAreaContent = article.getText();
			
			originator.setArticle(textAreaContent);
			careTaker.addMemento(originator.storeInMemento());
			currentArticle++;
			saveFile++;
			undo.setEnabled(true);
			
			
		});
		
		undo.addActionListener(e -> {
			
			if(currentArticle >= 1) {
				
				currentArticle--;
				String articleContent = originator.restoreFromMemento(careTaker.getMemento(currentArticle));
				article.setText(articleContent);
				article.setCaretPosition(articleContent.length());
				
				redo.setEnabled(true);
			} else {
				
				undo.setEnabled(false);
			}
			
			
		});

		redo.addActionListener(e -> {
	
			if(saveFile-1 > currentArticle) {
				
				currentArticle++;
				
				String articleContent = originator.restoreFromMemento(careTaker.getMemento(currentArticle));
				article.setText(articleContent);
				article.setCaretPosition(articleContent.length());
				
				undo.setEnabled(true);
				
			} else {
				
				redo.setEnabled(false);
			}
	
	
		});
		
		jPanel.add(save);
		jPanel.add(undo);
		jPanel.add(redo);
		
		this.add(jPanel);
		
		this.setVisible(true);
	}

}
