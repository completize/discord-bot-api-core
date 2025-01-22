package com.completize.discord.bot.api.core.data;

public interface EntityEntry<ID, ENTITY> {

    ID getId();
    ENTITY getEntity();

}
