package com.completize.discord.bot.api.core.exception.model;

import java.io.Serializable;
import java.time.Instant;

public record ResponseExceptionEntity(Instant timestamp, int status, String error, String message, String path) implements Serializable { }
