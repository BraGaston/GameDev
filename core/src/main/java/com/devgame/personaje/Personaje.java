package com.devgame.personaje;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.devgame.render.Render;

public class Personaje {
    public Texture textura;
    public Sprite sprite;


    public Personaje(float x,float y,float alto, float ancho){
        textura = new Texture("marco.png");
        sprite = new Sprite(textura);
        sprite.setPosition(x,y);
        sprite.setSize(alto,ancho);


    }

    public void dibujar() {
        sprite.draw(Render.batch);
    }
    public void setX(float x){
        sprite.setX(x);
    }
    public void setY(float y){
        sprite.setY(y);
    }
}
