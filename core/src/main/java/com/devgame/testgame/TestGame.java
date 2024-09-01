package com.devgame.testgame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.devgame.pantallacarga.PantallaCarga;
import com.devgame.render.Render;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class TestGame extends Game {
    @Override
    public void create() {
        Render.main = this;
        Render.batch = new SpriteBatch();
        this.setScreen(new PantallaCarga());
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        Render.batch.dispose();
    }
}
