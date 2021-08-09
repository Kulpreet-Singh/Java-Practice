public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0){
            return -1;
        }
        double area = width * height;
        double buckets = area / areaPerBucket;
        int bucketCount = (int) Math.ceil(buckets);
        return bucketCount - extraBuckets;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width<=0 || height<=0 || areaPerBucket<=0){
            return -1;
        }
        double area = width * height;
        double buckets = area / areaPerBucket;
        int bucketCount = (int) Math.ceil(buckets);
        return bucketCount;
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area<=0 || areaPerBucket<=0){
            return -1;
        }
        double buckets = area / areaPerBucket;
        int bucketCount = (int) Math.ceil(buckets);
        return bucketCount;
    }
}
