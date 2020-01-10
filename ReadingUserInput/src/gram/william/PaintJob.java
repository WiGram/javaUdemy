package gram.william;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;

        double areaToCover = width * height;
        double areaCoverable = areaPerBucket * extraBuckets;
        double areaNotCovered = areaToCover - areaCoverable;
        int bucketsNeeded = (int) Math.ceil(areaNotCovered / areaPerBucket);

        return bucketsNeeded;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;
        double extraBuckets = 0;
        double areaToCover = width * height;
        double areaCoverable = areaPerBucket * extraBuckets;
        double areaNotCovered = areaToCover - areaCoverable;
        int bucketsNeeded = (int) Math.ceil(areaNotCovered / areaPerBucket);

        return bucketsNeeded;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) return -1;
        double extraBuckets = 0;
        double areaCoverable = areaPerBucket * extraBuckets;
        double areaNotCovered = area - areaCoverable;
        int bucketsNeeded = (int) Math.ceil(areaNotCovered / areaPerBucket);

        return bucketsNeeded;
    }


}
