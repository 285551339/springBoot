package cn.abel.springBoot;

import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.cluster.routing.Preference;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.core.query.SourceFilter;

import java.util.Collection;
import java.util.List;

/**
* @Description:
* @Author: zc
* @CreateDate: 2019/5/8 11:47
* @Remark:
* @Version: 1.0
*/
public interface Query {

    public static final int DEFAULT_PAGE_SIZE = 10;
    public static final Pageable DEFAULT_PAGE = PageRequest.of(0, DEFAULT_PAGE_SIZE);

    /**
     * restrict result to entries on given page. Corresponds to the 'start' and 'rows' parameter in elasticsearch
     *
     * @param pageable
     * @return
     */
    <T extends Query> T setPageable(Pageable pageable);

    /**
     * Get filter queries if defined
     *
     * @return
     */
    // List<FilterQuery> getFilterQueries();

    /**
     * Get page settings if defined
     *
     * @return
     */
    Pageable getPageable();

    /**
     * Add {@link org.springframework.data.domain.Sort} to query
     *
     * @param sort
     * @return
     */
    <T extends Query> T addSort(Sort sort);

    /**
     * @return null if not set
     */
    Sort getSort();

    /**
     * Get Indices to be searched
     *
     * @return
     */
    List<String> getIndices();

    /**
     * Add Indices to be added as part of search request
     *
     * @param indices
     */
    void addIndices(String... indices);

    /**
     * Add types to be searched
     *
     * @param types
     */
    void addTypes(String... types);

    /**
     * Get types to be searched
     *
     * @return
     */
    List<String> getTypes();

    /**
     * Add fields to be added as part of search request
     *
     * @param fields
     */
    void addFields(String... fields);

    /**
     * Get fields to be returned as part of search request
     *
     * @return
     */
    List<String> getFields();

    /**
     * Add source filter to be added as part of search request
     *
     * @param sourceFilter
     */
    void addSourceFilter(SourceFilter sourceFilter);

    /**
     * Get SourceFilter to be returned to get include and exclude source
     * fields as part of search request.
     *
     * @return SourceFilter
     */
    SourceFilter getSourceFilter();

    /**
     * Get minimum score
     *
     * @return
     */
    float getMinScore();

    /**
     * Get Ids
     *
     * @return
     */
    Collection<String> getIds();

    /**
     * Get route
     *
     * @return
     */
    String getRoute();


    /**
     * Type of search
     *
     * @return
     */
    SearchType getSearchType();

    /**
     * type of preference
     *
     * @return
     */
    Preference getPreference();
}
