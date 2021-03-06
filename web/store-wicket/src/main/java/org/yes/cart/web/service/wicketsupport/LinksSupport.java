/*
 * Copyright 2009 Denys Pavlov, Igor Azarnyi
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.yes.cart.web.service.wicketsupport;

import org.apache.wicket.Page;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * Support for working with links by providing various convenience
 * factory methods to generate common links to the current store
 * home page. This includes: category, content, product and sku
 * page links.
 *
 * User: denispavlov
 * Date: 13-06-28
 * Time: 8:30 AM
 */
public interface LinksSupport {

    /**
     * Create new instance of page parameters from current page parameters
     * except parameters that need to be stripped out (such as commands).
     *
     * @param pageParameters    current page parameters
     *
     * @return new instance of page parameters that can be used for links
     */
    PageParameters getFilteredCurrentParameters(PageParameters pageParameters);

    /**
     * Generic bookmarkable link with given page parameters.
     *
     * @param linkId            wicket link component id
     * @param pageParameters    link parameters
     *
     * @return bookmarkable link
     */
    Link newLink(String linkId,
                 PageParameters pageParameters);

    /**
     * @param linkId            wicket link component id
     * @param categoryRef       category PK or SEO URI
     *
     * @return bookmarkable category link
     */
    Link newCategoryLink(String linkId,
                         Object categoryRef);

    /**
     * @param linkId            wicket link component id
     * @param categoryRef       category PK or SEO URI
     * @param pageParameters    current request parameters that will be filtered and carried over to new link
     *
     * @return bookmarkable category link
     */
    Link newCategoryLink(String linkId,
                         long categoryRef,
                         PageParameters pageParameters);

    /**
     * @param linkId            wicket link component id
     * @param contentRef        content PK or SEO URI
     * @return bookmarkable content link
     */
    Link newContentLink(String linkId,
                        Object contentRef);

    /**
     * @param linkId            wicket link component id
     * @param contentRef        content PK or SEO URI
     * @param pageParameters    current request parameters that will be filtered and carried over to new link
     *
     * @return bookmarkable content link
     */
    Link newContentLink(String linkId,
                        Object contentRef,
                        PageParameters pageParameters);

    /**
     * @param linkId            wicket link component id
     * @param supplier          supplier
     * @param productRef        product PK or SEO URI
     *
     * @return bookmarkable product link
     */
    Link newProductLink(String linkId,
                        String supplier,
                        Object productRef);

    /**
     * @param linkId            wicket link component id
     * @param supplier          supplier
     * @param productRef        product PK or SEO URI
     * @param pageParameters    current request parameters that will be filtered and carried over to new link
     *
     * @return bookmarkable product link
     */
    Link newProductLink(String linkId,
                        String supplier,
                        Object productRef,
                        PageParameters pageParameters);

    /**
     * @param linkId            wicket link component id
     * @param supplier          supplier
     * @param productRef        product PK or URI
     *
     * @return bookmarkable product link
     */
    Link newProductSkuLink(String linkId,
                           String supplier,
                           Object productRef);

    /**
     * @param linkId            wicket link component id
     * @param supplier          supplier
     * @param productRef        product PK or URI
     * @param pageParameters    current request parameters that will be filtered and carried over to new link
     *
     * @return bookmarkable product link
     */
    Link newProductSkuLink(String linkId,
                           String supplier,
                           Object productRef,
                           PageParameters pageParameters);

    /**
     * @param linkId            wicket link component id
     * @param supplier          supplier
     * @param skuCode           SKU to add to cart
     * @param quantity          quantity to add
     * @param pageParameters    current request parameters that will be filtered and carried over to new link
     *
     * @return bookmarkable link
     */
    Link newAddToCartLink(String linkId,
                          String supplier,
                          String skuCode,
                          String quantity,
                          PageParameters pageParameters);

    /**
     * @param linkId            wicket link component id
     * @param supplier          supplier
     * @param skuCode           SKU to add to cart
     * @param quantity          quantity to add
     * @param wishlistId        wishlist id
     * @param target            target page
     * @param pageParameters    current request parameters that will be filtered and carried over to new link
     *
     * @return bookmarkable link
     */
    Link newAddToCartLink(String linkId,
                          String supplier,
                          String skuCode,
                          String quantity,
                          String wishlistId,
                          Class<Page> target,
                          PageParameters pageParameters);

    /**
     * @param linkId            wicket link component id
     * @param supplier          supplier
     * @param skuCode           SKU to add to cart
     * @param quantity          quantity to add
     * @param wishList          wish list type
     * @param tags              wish list tags
     * @param pageParameters    current request parameters that will be filtered and carried over to new link
     *
     * @return bookmarkable link
     */
    Link newAddToWishListLink(String linkId,
                              String supplier,
                              String skuCode,
                              String quantity,
                              String wishList,
                              String tags,
                              PageParameters pageParameters);

    /**
     * @param linkId            wicket link component id
     * @param supplier          supplier
     * @param skuCode           SKU to add to cart
     * @param quantity          quantity to add
     * @param wishList          wish list type
     * @param tags              wish list tags
     * @param visibility        wish list item visibility
     * @param pageParameters    current request parameters that will be filtered and carried over to new link
     *
     * @return bookmarkable link
     */
    Link newAddToWishListLink(String linkId,
                              String supplier,
                              String skuCode,
                              String quantity,
                              String wishList,
                              String tags,
                              String visibility,
                              PageParameters pageParameters);

    /**
     * @param linkId            wicket link component id
     * @param supplier          supplier
     * @param skuCode           SKU to add to cart
     * @param itemId            wish list item pk
     * @param target            target page
     * @param pageParameters    current request parameters that will be filtered and carried over to new link
     *
     * @return bookmarkable link
     */
    Link newRemoveFromWishListLink(String linkId,
                                   String supplier,
                                   String skuCode,
                                   Long itemId,
                                   Class<Page> target,
                                   PageParameters pageParameters);


    /**
     * @param linkId            wicket link component id
     * @param coupon            coupon code
     * @param target            target page
     * @param pageParameters    current request parameters that will be filtered and carried over to new link
     *
     * @return bookmarkable link
     */
    Link newAddCouponLink(String linkId,
                          String coupon,
                          Class<Page> target,
                          PageParameters pageParameters);


    /**
     * @param linkId            wicket link component id
     * @param coupon            coupon code
     * @param target            target page
     * @param pageParameters    current request parameters that will be filtered and carried over to new link
     *
     * @return bookmarkable link
     */
    Link newRemoveCouponLink(String linkId,
                             String coupon,
                             Class<Page> target,
                             PageParameters pageParameters);


    /**
     * @param linkId            wicket link component id
     * @param pageParameters    current request parameters that will be filtered and carried over to new link
     *
     * @return bookmarkable link
     */
    Link newLogOffLink(String linkId,
                       PageParameters pageParameters);

    /**
     * @param linkId            wicket link component id
     * @param language          language to change to
     * @param target            optional current page class
     * @param pageParameters    current request parameters that will be filtered and carried over to new link
     *
     * @return bookmarkable link
     */
    Link newChangeLocaleLink(String linkId,
                             String language,
                             Class<? extends Page> target,
                             PageParameters pageParameters);

    /**
     * @param linkId            wicket link component id
     * @param currency          currency to change to
     * @param target            optional current page class
     * @param pageParameters    current request parameters that will be filtered and carried over to new link
     *
     * @return bookmarkable link
     */
    Link newChangeCurrencyLink(String linkId,
                               String currency,
                               Class<? extends Page> target,
                               PageParameters pageParameters);

}
