package inf112.skeleton.app.model;

import java.util.ArrayList;

import inf112.skeleton.app.model.catmenu.CatMenu;
import inf112.skeleton.app.model.entities.cat.ICat;
import inf112.skeleton.app.model.entities.rat.IRat;

public interface ISkadedyrModel {
    
    /**
     * Gets all cats currently in the game
     * @return an ArrayList of Cat objects
     */
    ArrayList<ICat> getCats();

    /**
     * Gets all currently alive rats in the game
     * @return an ArrayList of Rat objects
     */
    ArrayList<IRat> getRats();

 
    /**
     * Moves all cats by one
     */
    void clockTick();

    /**
     * Sets the game to paused or unpaused
     */
    void setPause();

    /**
     * Checks if the game is paused
     * @return true if the game is paused, false otherwise
     */
    boolean isPaused();

    /**
     * Gets the current speed of the game
     * @return the speed of the game
     */
    float getSpeed();

    /**
     * Sets the speed of the game
     */
    void setSpeed();

    /**
     * Restarts the game by running the main method again
     */
    void restart();

    /**
     * Exits the game
     */
    String exit();

  
    /**
     * Get the amount of money the player has
     * @return the amount of money the player has
     */
    int getMoney();

    /**
     * Sets the amount of money the player has
     * @param money the amount of money the player has
     */
    void setMoney(int money);

    /**
     * Gets the level of the game
     * @return the level of the game
     */
    int getLevel();


    /**
     * Gets the amount of points the player has
     * @return the amount of points the player has
     */
    int getPoints();


    /**
     * Gets the amount of lives the player has
     * @return the amount of lives the player has
     */
    int getLives();

    /**
     * Get the cat menu object
     * @return the CatMenu object
     */
    CatMenu getCatMenu();


    /**
     * Checks if the game has been won.
     * @return a boolean value - true if the game has been won, false otherwise.
     */
    boolean isGameWon();


      /**
     * Checks if the game is over.
     * @return a boolean value - true if the game is over, false otherwise.
     */
    boolean isGameOver();










}
