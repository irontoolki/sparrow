package net.payla.webapp.core.products;

import net.payla.webapp.core.catalog.classes.Categories;
import net.payla.webapp.core.catalog.classes.Download;
import net.payla.webapp.core.catalog.interfaces.Brand;
import net.payla.webapp.core.catalog.interfaces.Filter;
import net.payla.webapp.core.products.punits.*;
import net.payla.webapp.core.suppliers.Supplier;

import java.net.URL;
import java.util.List;

/**
 * product description
 */
public class Product {

    //general info
    private String productId;
    private StatusType status;
    private String productNamePersian;
    private String productNameLatin;
    private Categories categories;
    private Supplier supplier;
    private String barcode;
    private Brand brand;

    // image and context
    private URL imageURL1;
    private URL imageURL2;
    private URL imageURL3;
    private URL imageURL4;

    // product code
    private String nationalCode;
    private String NTIN;
    private String model;
    private String serialNumber;
    private String PMN;
    private String SKURCN;
    private String ISIC;
    private String HS;
    private String CPC;
    private String UNSPSC;

    //links
    private List<Filter> filter;
    private List<Download> download;
    private List<Long> relatedProductsId;

    //properties
    private boolean decreaseStoreHouse;
    private int decreaseNum;
    private SaleStatus saleStatus;
    private PackingClass packingClass;
    private HeightClass heightClass;
    private WeighClass weighClass;
    private int totalWeight;
    private int gross;
    private int length;
    private int width;
    private int height;

    //ISO & Standards
    private boolean ISO22000;
    private boolean ISO9001;
    private boolean ISO18000;
    private boolean ISO14001;
    private boolean HALAL;
    private boolean FADORG; // food and drug organization
    private boolean HACCP;
    private boolean SGS;

    // price
    private Currency currency;
    private long endUserPrice;
    private float sellerOff;
    private long onessellerPrice; // WTF!!! please ask it!

    private ProductCountUnit productCountUnit;
    private int countPerUnit;
    private int pricePerUnit;
    private int grossPerUnit;
    private TaxClass taxClass;

    // order policy

    private int minOrderCount;
    private ProductCountUnit minOrderUnit;
    private int maxOrderCount;
    private ProductCountUnit maxOrderUnit;


}
