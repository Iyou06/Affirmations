package com.example.affirmations.model;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Affirmation {
    private final int stringResourceId;
    private final int imageResourceId;

    public int getStringResourceId() {
        return this.stringResourceId;
    }

    public int getImageResourceId() {
        return this.imageResourceId;
    }

    public Affirmation(@StringRes int stringResourceId, @DrawableRes int imageResourceId) {
        this.stringResourceId = stringResourceId;
        this.imageResourceId = imageResourceId;
    }

    public int component1() {
        return this.stringResourceId;
    }

    public int component2() {
        return this.imageResourceId;
    }

    @NotNull
    public Affirmation copy(@StringRes int stringResourceId, @DrawableRes int imageResourceId) {
        return new Affirmation(stringResourceId, imageResourceId);
    }

    public static Affirmation copy$default(Affirmation var0, int var1, int var2, int var3, Object var4) {
        if ((var3 & 1) != 0) {
            var1 = var0.stringResourceId;
        }

        if ((var3 & 2) != 0) {
            var2 = var0.imageResourceId;
        }

        return var0.copy(var1, var2);
    }

    @NotNull
    public String toString() {
        return "Affirmation(stringResourceId=" + this.stringResourceId + ", imageResourceId=" + this.imageResourceId + ")";
    }

    public int hashCode() {
        return Integer.hashCode(this.stringResourceId) * 31 + Integer.hashCode(this.imageResourceId);
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof Affirmation) {
                Affirmation var2 = (Affirmation)var1;
                if (this.stringResourceId == var2.stringResourceId && this.imageResourceId == var2.imageResourceId) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
