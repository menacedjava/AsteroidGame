package org.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class AsteroidsGame extends JPanel implements ActionListener, KeyListener {
    private int shipX = 300, shipY = 300, shipAngle = 0, shipSpeed = 0;
    private ArrayList<Bullet> bullets;
    private ArrayList<Asteroid> asteroids;
    private Timer timer;
    private Random random;

    public AsteroidsGame() {
        setPreferredSize(new Dimension(600, 600));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);
        bullets = new ArrayList<>();
        asteroids = new ArrayList<>();
        random = new Random();
        timer = new Timer(20, this);
        timer.start();
        for (int i = 0; i < 5; i++) spawnAsteroid();
    }

//    private void spawnAsteroid() {
//        asteroids.add(new Asteroid(random.nextInt(600), random.nextInt(600), random.nextInt(4) - 2, random.nextInt(4) - 2));
//    }

//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        g.setColor(Color.WHITE);
//        int x1 = (int) (shipX + Math.cos(Math.toRadians(shipAngle)) * 20);
//        int y1 = (int) (shipY + Math.sin(Math.toRadians(shipAngle)) * 20);
//        int x2 = (int) (shipX + Math.cos(Math.toRadians(shipAngle + 140)) * 20);
//        int y2 = (int) (shipY + Math.sin(Math.toRadians(shipAngle + 140)) * 20);
//        int x3 = (int) (shipX + Math.cos(Math.toRadians(shipAngle - 140)) * 20);
//        int y3 = (int) (shipY + Math.sin(Math.toRadians(shipAngle - 140)) * 20);
//        g.drawPolygon(new int[]{x1, x2, x3}, new int[]{y1, y2, y3}, 3);
//        for (Bullet bullet : bullets) g.fillOval(bullet.x, bullet.y, 5, 5);
//        g.setColor(Color.RED);
//        for (Asteroid asteroid : asteroids) g.fillOval(asteroid.x, asteroid.y, 30, 30);
//    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        shipX += shipSpeed * Math.cos(Math.toRadians(shipAngle));
//        shipY += shipSpeed * Math.sin(Math.toRadians(shipAngle));
//        if (shipX < 0) shipX = 600;
//        if (shipX > 600) shipX = 0;
//        if (shipY < 0) shipY = 600;
//        if (shipY > 600) shipY = 0;
//        Iterator<Bullet> bulletIterator = bullets.iterator();
//        while (bulletIterator.hasNext()) {
//            Bullet bullet = bulletIterator.next();
//            bullet.x += bullet.speed * Math.cos(Math.toRadians(bullet.angle));
//            bullet.y += bullet.speed * Math.sin(Math.toRadians(bullet.angle));
//            if (bullet.x < 0 || bullet.x > 600 || bullet.y < 0 || bullet.y > 600) bulletIterator.remove();
//        }
//        Iterator<Asteroid> asteroidIterator = asteroids.iterator();
//        while (asteroidIterator.hasNext()) {
//            Asteroid asteroid = asteroidIterator.next();
//            asteroid.x += asteroid.dx;
//            asteroid.y += asteroid.dy;
//            if (asteroid.x < 0) asteroid.x = 600;
//            if (asteroid.x > 600) asteroid.x = 0;
//            if (asteroid.y < 0) asteroid.y = 600;
//            if (asteroid.y > 600) asteroid.y = 0;
//            bulletIterator = bullets.iterator();
//            while (bulletIterator.hasNext()) {
//                Bullet bullet = bulletIterator.next();
//                if (new Rectangle(asteroid.x, asteroid.y, 30, 30).intersects(new Rectangle(bullet.x, bullet.y, 5, 5))) {
//                    bulletIterator.remove();
//                    asteroidIterator.remove();
//                    spawnAsteroid();
//                    break;
//                }
//            }
//        }
//        repaint();
//    }

//    @Override
//    public void keyPressed(KeyEvent e) {
//        if (e.getKeyCode() == KeyEvent.VK_LEFT) shipAngle -= 10;
//        if (e.getKeyCode() == KeyEvent.VK_RIGHT) shipAngle += 10;
//        if (e.getKeyCode() == KeyEvent.VK_UP) shipSpeed = 5;
//        if (e.getKeyCode() == KeyEvent.VK_DOWN) shipSpeed = 0;
//        if (e.getKeyCode() == KeyEvent.VK_SPACE) bullets.add(new Bullet(shipX, shipY, shipAngle));
//    }

//    @Override
//    public void keyReleased(KeyEvent e) {}
//
//    @Override
//    public void keyTyped(KeyEvent e) {}
/*

    public static void main(String[] args) {
        JFrame frame = new JFrame("Asteroids Game");
        AsteroidsGame game = new AsteroidsGame();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
 */
}