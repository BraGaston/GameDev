package com.devgame.image;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.devgame.render.Render;

public class Image {
    private Texture texture;
    private Sprite sprite;
    float screenWidth = Gdx.graphics.getWidth();
    float screenHeight = Gdx.graphics.getHeight();

    public Image(String path){
        texture = new Texture(path);
        sprite = new Sprite(texture);
        // Obtén el tamaño de la imagen
        float imageWidth = texture.getWidth();
        float imageHeight = texture.getHeight();

        // Calcula las coordenadas para centrar la imagen
        float x = (screenWidth - imageWidth) / 2;
        float y = (screenHeight - imageHeight) / 2;
        sprite.setPosition(x,y);
    }

    public void dibujar(){
        sprite.draw(Render.batch);
    }

    public void setTransparencia(float alpha){
        sprite.setAlpha(alpha);
    }

}
