package com.socialmediaapp.mapper;

import com.socialmediaapp.dto.PostsDto;
import com.socialmediaapp.vo.PostsVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-06T14:59:59+0530",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class PostsMapperImpl implements PostsMapper {

    @Override
    public PostsDto postsVoToPostsDto(PostsVo postsVo) {
        if ( postsVo == null ) {
            return null;
        }

        PostsDto postsDto = new PostsDto();

        postsDto.setId( postsVo.getId() );
        postsDto.setImgUrl( postsVo.getImgUrl() );
        postsDto.setComments( postsVo.getComments() );
        postsDto.setCaption( postsVo.getCaption() );
        postsDto.setLikes( postsVo.getLikes() );
        postsDto.setCreatorDate( postsVo.getCreatorDate() );

        return postsDto;
    }

    @Override
    public PostsVo postsDtoToPostsVo(PostsDto postsDto) {
        if ( postsDto == null ) {
            return null;
        }

        PostsVo postsVo = new PostsVo();

        postsVo.setId( postsDto.getId() );
        postsVo.setImgUrl( postsDto.getImgUrl() );
        postsVo.setComments( postsDto.getComments() );
        postsVo.setCaption( postsDto.getCaption() );
        postsVo.setLikes( postsDto.getLikes() );
        postsVo.setCreatorDate( postsDto.getCreatorDate() );

        return postsVo;
    }

    @Override
    public List<PostsVo> toEmployeeVos(List<PostsDto> list) {
        if ( list == null ) {
            return null;
        }

        List<PostsVo> list1 = new ArrayList<PostsVo>( list.size() );
        for ( PostsDto postsDto : list ) {
            list1.add( postsDtoToPostsVo( postsDto ) );
        }

        return list1;
    }

    @Override
    public List<PostsDto> toEmployeeDtos(List<PostsVo> list) {
        if ( list == null ) {
            return null;
        }

        List<PostsDto> list1 = new ArrayList<PostsDto>( list.size() );
        for ( PostsVo postsVo : list ) {
            list1.add( postsVoToPostsDto( postsVo ) );
        }

        return list1;
    }
}
