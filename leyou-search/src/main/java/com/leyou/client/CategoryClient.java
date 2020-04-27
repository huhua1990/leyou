package com.leyou.client;

import com.leyou.item.api.CategoryApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author: 98050
 * Time: 2018-10-11 20:49
 * Feature:商品分类FeignClient
 */
@FeignClient(value = "item-service")
public interface CategoryClient extends CategoryApi {
}
