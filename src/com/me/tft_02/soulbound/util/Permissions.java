package com.me.tft_02.soulbound.util;

import org.bukkit.entity.Player;
import org.bukkit.permissions.PermissionAttachmentInfo;

public class Permissions {

    public static int getSoulbindMaximum(Player player) {
        String match = "soulbound.maximum_allowed.";
        int amount = -1;

        for (PermissionAttachmentInfo permission : player.getEffectivePermissions()) {
            if (permission.getPermission().startsWith(match) && permission.getValue()) {
                amount = Integer.parseInt(permission.getPermission().split("[.]")[2]);
            }
        }

        return amount;
    }
}
