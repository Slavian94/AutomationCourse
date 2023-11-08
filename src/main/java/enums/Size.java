package enums;

public enum Size {
    EXTRA_SMALL("XS", 18, 28),
    SMALL("S", 20, 30),
    MEDIUM("M", 22,32),
    LARGE("L", 24,34),
    EXTRA_LARGE("XL", 26,36),
    DOUBLE_EXTRA_LARGE("XXL", 28,38);
    private final String shortName;
    private final double wight;
    private final double length;

    Size(String shortName, double wight, double length) {
        this.shortName = shortName;
        this.wight = wight;
        this.length = length;
    }

    public String getShortName() {
        return shortName;
    }

    public double getWight() {
        return wight;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Short name: " + shortName + ", Width: " + wight + ", Length: " + length;
    }
}
