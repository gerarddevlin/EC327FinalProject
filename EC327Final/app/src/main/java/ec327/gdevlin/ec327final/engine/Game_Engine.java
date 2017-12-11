package ec327.gdevlin.ec327final.engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ec327.gdevlin.ec327final.Classes.Cords;
import ec327.gdevlin.ec327final.enums.Direction;
import ec327.gdevlin.ec327final.enums.Game_State;
import ec327.gdevlin.ec327final.enums.Board;

/**
 * Created by gerrydevlin on 12/10/17.
 */

public class Game_Engine {
    public static final int Width = 19;         //sizes of border
    public static final int Height = 25;
    public static int Score = 0;
    private List<Cords> walls = new ArrayList<>();
    private List<Cords>snake = new ArrayList<>();
    private List<Cords>fruit = new ArrayList<>();
    private boolean increment_tail = false;
    private Random random = new Random();

    private Direction currentDirection = Direction.East;

    private Cords getSnakeHead(){
        return snake.get(0);
    }

    public void Update() {  //updates snake position
        switch (currentDirection) {
            case North:
                UpdateSnake(0, -1);
                break;
            case East:
                UpdateSnake(1, 0);
                break;
            case South:
                UpdateSnake(0, 1);
                break;
            case West:
                UpdateSnake(-1, 0);
                break;
        }

        //collision check

        for (Cords w : walls) {
            if (snake.get(0).equals(w)) {
                currentGame_State = Game_State.Lost;

            }
        }
        for (int i = 1; i < snake.size(); i++) {
            if (getSnakeHead().equals(snake.get(i))) {
                currentGame_State = Game_State.Lost;        //lose if head touches body
                return;
            }
        }

        Cords remove_Fruit = null;

        for (Cords fruits : fruit) {
            if(getSnakeHead().equals(fruits)){
                remove_Fruit = fruits;
                increment_tail = true;
                Score++;
            }
        }
        if(remove_Fruit != null){
            fruit.remove(remove_Fruit);
            plusFruit();
        }

    }

    public void inGame(){
        plusWalls();
        plusSnake();
        plusFruit();
    }

    public void UpdateDir(Direction newDirection){  //changes direction of snake
        if(Math.abs(newDirection.ordinal() - currentDirection.ordinal()) % 2 == 1){
            currentDirection = newDirection;
        }
    }

    public Board[][]getMap(){
        Board[][]map = new Board[Width][Height];

        for(int x = 0; x < Width; x++){
            for(int y = 0; y < Height; y++){
                map[x][y] = Board.Nothing;
            }
        }

        for(Cords s : snake){
            map[s.getX()][s.getY()] = Board.SnakeTail;
        }
        map[snake.get(0).getX()][snake.get(0).getY()] = Board.SnakeHead;

        for(Cords wall: walls){
            map[wall.getX()][wall.getY()] = Board.Wall;
        }
        for(Cords f : fruit){
            map[f.getX()][f.getY()] = Board.Fruit;
        }
        return map;
    }

    private void UpdateSnake(int x, int y){         //updates x y coordinates of snake

        int newX = snake.get(snake.size() - 1).getX();
        int newY = snake.get(snake.size() - 1).getY();

        for(int i = snake.size()-1; i > 0;i--){
            snake.get(i).setX(snake.get(i-1).getX());
            snake.get(i).setY(snake.get(i-1).getY());
        }

        if(increment_tail){
            snake.add(new Cords(newX,newY));
            increment_tail = false;
        }

        snake.get(0).setX(snake.get(0).getX()+x);
        snake.get(0).setY(snake.get(0).getY()+y);
    }

    private void plusSnake(){            //adds initial snake
        snake.clear();      //removes from snake list

        snake.add(new Cords(5,7));
        snake.add(new Cords(4,7));
        snake.add(new Cords(3,7));
        snake.add(new Cords(2,7));
    }
    private void plusWalls(){
        //top and bottom border
        for(int x = 0; x < Width; x++){
            walls.add(new Cords(x,0));
            walls.add(new Cords(x,Height-1));
        }
        //Left and right border
        for(int y =1; y < Height; y++){
            walls.add(new Cords(0,y));
            walls.add(new Cords(Width-1,y));
        }
    }
    private Game_State currentGame_State = Game_State.Running;

    private void plusFruit(){            //adds fruit to game

        Cords cords = null;
        boolean has_fruit = false;

        while(!has_fruit){
            int x = 1 + random.nextInt(Width - 2);
            int y = 1 + random.nextInt(Height - 2);

            cords = new Cords(x , y);
            boolean collision = false;
            for(Cords s : snake){
                if(s.equals(cords)){
                    collision = true;
                    break;
                }
            }

            for(Cords f : fruit){
                if(f.equals(cords)){
                    collision = true;
                    break;
                }
            }
            has_fruit = !collision;
        }
        fruit.add(cords);
    }

    public Game_State getCurrentGame_State(){
        return currentGame_State;
    }
}

