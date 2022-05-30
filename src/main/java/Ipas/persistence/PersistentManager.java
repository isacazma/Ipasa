package Ipas.persistence;


import Ipas.model.Product;
import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobContainerClientBuilder;

import java.io.*;
import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobContainerClientBuilder;


public class PersistentManager {
    private  static String ENDPOINT= "https://egebep.blob.core.windows.net/";
    private  static String SASTOKEN ="?sv=2020-08-04&ss=bfqt&srt=sco&sp=rwdlacupitfx&se=2022-05-28T03:04:25Z&st=2022-05-27T19:04:25Z&spr=https&sig=vsUx2PXHRGTFglyJhDCOq5GBU%2BoPmsfz1xZa4exFFHE%3D";
    private  static String CONTAINER = "worldcontainer";

    private static BlobContainerClient blobContainer = new BlobContainerClientBuilder()
            .endpoint(ENDPOINT)
            .sasToken(SASTOKEN)
            .containerName(CONTAINER)
            .buildClient();

//    public static void loadWorldFromAzure() throws IOException, ClassNotFoundException {
//        if (blobContainer.exists()) {
//            BlobClient blob = blobContainer.getBlobClient("world_blob");
//
//
//        }
    }
//
//    public static void saveWorldToAzure() throws IOException {
////        if (!blobContainer.exists()) {
////            blobContainer.create();
////        }
////
////        BlobClient blob = blobContainer.getBlobClient("world_blob");
////        Product worldToSave = Product.getWorld();
////
////        ByteArrayOutputStream baos = new ByteArrayOutputStream();
////        ObjectOutputStream oos = new ObjectOutputStream(baos);
////        oos.writeObject(worldToSave);
////
////        byte[] bytez = baos.toByteArray();
////
////        ByteArrayInputStream bais = new ByteArrayInputStream(bytez);
////        blob.upload(bais, bytez.length, true);
////    }
//}
