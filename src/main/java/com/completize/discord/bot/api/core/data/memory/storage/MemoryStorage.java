package com.completize.discord.bot.api.core.data.memory.storage;

import com.completize.discord.bot.api.core.data.EntityEntry;

public interface MemoryStorage<ID, ENTITY, DELEGATE> extends Iterable<EntityEntry<ID, ENTITY>> {

    DELEGATE getDelegate();

}
