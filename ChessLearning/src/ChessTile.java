import java.awt.Color;

import javax.swing.JPanel;


public class ChessTile {
	private JPanel panel;
	
	private int width;
	private int height;
	
	private Color color;
	private boolean highlighted = false;
	
	private ChessPiece occupant = null;
	
	/**
	 * Constructor for the tile piece, sets the initial width and the height of the tile
	 * 
	 * @param width - The width of the tile
	 * @param height - The height of the tile
	 */
	public ChessTile(int width, int height) {
		this.width = width;
		this.height = height;
		
		panel = new JPanel();
		panel.setSize(this.width, this.height);
	}
	
	/**
	 * Sets the size of the tile using the parameters,
	 * changes the panel size and the stored variables size
	 * 
	 * @param width - The new width of the tile
	 * @param height - The new height of the tile
	 */
	public void setSize(int width, int height) {
		this.width = width;
		this.height = height;
		
		panel.setSize(this.width, this.height);
	}

	public void SetColor(Color color) {
		this.color = color;
		panel.setBackground(this.color);
	}
	
	public boolean isOccupied() {
		return occupant == null;
	}
	
	public void add(JPanel newPanel) {
		this.panel.add(newPanel);
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public void setHighlighted(boolean flag) {
		highlighted = flag;
		
		if (this.highlighted) panel.setBackground(Color.RED);
		else panel.setBackground(this.color);
	}
}
