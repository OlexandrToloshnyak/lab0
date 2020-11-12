package com.company.addons;

import java.util.Objects;

public class MatrixAddon {
    public int i;
    public int j;

    public MatrixAddon(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatrixAddon addon = (MatrixAddon) o;
        return i == addon.i &&
                j == addon.j;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, j);
    }

    @Override
    public String toString() {
        return "i=" + i +
                ", j=" + j;
    }
}
