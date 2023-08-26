package net.unknownbits.waypoints.commands;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import net.unknownbits.waypoints.Waypoints;

public class WaypointsCommmand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(CommandManager.literal("waypoints")
                .executes(context -> {
                    context.getSource().sendMessage(Text.translatable("waypoints.info", Waypoints.VERSTION));
                    return 0;
        }).then(CommandManager.literal("reload")
                .requires(source -> source.hasPermissionLevel(2))
                .executes(context -> {
                    context.getSource().sendMessage(Text.literal("/"));
                    return 0;
        })).then(CommandManager.literal("list").executes(context -> {
                    return 0;
        })).then(CommandManager.literal("add").executes(context -> {
                    return 0;
        })).then(CommandManager.literal("remove").executes(context -> {
                    return 0;
        }))
        );
    }
}