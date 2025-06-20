# Accelerator Log

## Options
```json
{
  "projectName" : "sb-demo-spring-music",
  "persistenceType" : "jpa",
  "databaseType" : "postgres",
  "javaVersion" : "21",
  "includeBuildToolWrapper" : true
}
```
## Log
```
┏ engine (Chain)
┃  Info Running Chain(Exclude, GeneratorValidationTransform, UniquePath)
┃ ┏ engine.transformations[0] (Exclude)
┃ ┃  Info Will exclude [accelerator.yaml, accelerator.axl]
┃ ┃ Debug accelerator.axl matched [accelerator.yaml, accelerator.axl] -> excluded
┃ ┃ Debug LICENSE didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug accelerator.yaml matched [accelerator.yaml, accelerator.axl] -> excluded
┃ ┃ Debug README.md didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug .gitignore didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug build.gradle didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug .gitattributes didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug manifest.yml didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug gradle.properties didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug settings.gradle didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/test/java/com/example/music/ApplicationTests.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/albums.json didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/static/index.html didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/static/css/app.css didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/static/css/multi-columns-row.css didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/static/js/info.js didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/static/js/errors.js didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/static/js/status.js didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/static/js/albums.js didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/static/js/app.js didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/static/img/glyphicons-halflings.png didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/static/img/glyphicons-halflings-white.png didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/static/templates/status.html didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/static/templates/list.html didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/static/templates/grid.html didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/static/templates/albums.html didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/static/templates/errors.html didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/static/templates/footer.html didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/static/templates/header.html didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/static/templates/albumForm.html didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/application.yml didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/java/com/example/music/Application.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/java/com/example/music/config/data/RedisConfig.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/java/com/example/music/web/InfoController.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/java/com/example/music/web/ErrorController.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/java/com/example/music/web/AlbumController.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/java/com/example/music/repositories/redis/RedisAlbumRepository.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/java/com/example/music/repositories/jpa/JpaAlbumRepository.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/java/com/example/music/repositories/mongodb/MongoAlbumRepository.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/java/com/example/music/repositories/AlbumRepositoryPopulator.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/java/com/example/music/domain/Album.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/java/com/example/music/domain/ApplicationInfo.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┗ Debug src/main/java/com/example/music/domain/RandomIdGenerator.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┏ ┏ engine.transformations[1].validated (Chain)
┃ ┃ ┃  Info Running Chain(ApplyTo, IfElse, IfElse, IfElse, ApplyTo, ApplyTo, ApplyTo, Merge, UniquePath, Merge, UniquePath, Provenance)
┃ ┃ ┃ ╺ engine.transformations[1].validated.transformations[0].apply (TextPreprocessor)
┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[1] (IfElse)
┃ ┃ ┃ ┃ Debug LICENSE matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug .gitignore matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug .gitattributes matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug gradle.properties matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug settings.gradle matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/resources/albums.json matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/resources/static/index.html matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/resources/static/css/app.css matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/resources/static/css/multi-columns-row.css matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/resources/static/js/info.js matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/resources/static/js/errors.js matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/resources/static/js/status.js matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/resources/static/js/albums.js matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/resources/static/js/app.js matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/resources/static/img/glyphicons-halflings.png matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/resources/static/img/glyphicons-halflings-white.png matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/status.html matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/list.html matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/grid.html matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/albums.html matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/errors.html matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/footer.html matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/header.html matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/albumForm.html matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug README.md matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug build.gradle matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug manifest.yml matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/test/java/com/example/music/ApplicationTests.java matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/resources/application.yml matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/Application.java matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/config/data/RedisConfig.java didn't match [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> excluded
┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/web/InfoController.java matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/web/ErrorController.java matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/web/AlbumController.java matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/repositories/redis/RedisAlbumRepository.java didn't match [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> excluded
┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/repositories/jpa/JpaAlbumRepository.java matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/repositories/mongodb/MongoAlbumRepository.java didn't match [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> excluded
┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/repositories/AlbumRepositoryPopulator.java matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/domain/Album.java matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/domain/ApplicationInfo.java matched [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> included
┃ ┃ ┃ ┗ Debug src/main/java/com/example/music/domain/RandomIdGenerator.java didn't match [!'src/main/java/com/example/music/config/data/**' && !'src/main/java/com/example/music/domain/RandomIdGenerator.java' && !'src/main/java/com/example/music/repositories/mongodb/**' && !'src/main/java/com/example/music/repositories/redis/**'] -> excluded
┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[2] (IfElse)
┃ ┃ ┃ ┗ null ()
┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[3] (IfElse)
┃ ┃ ┃ ┗ null ()
┃ ┃ ┃ ╺  Info Will replace [spring-music->sb-demo-spring-music]
┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].apply (IfElse)
┃ ┃ ┃ ┃ engine.transformations[1].validated.transformations[5].apply.then (Chain)
┃ ┃ ┃ ┃  Info Running Chain(IfElse, IfElse)
┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].apply.then.transformations[0] (IfElse)
┃ ┃ ┃ ┃ ┗  Info Will replace regex 'SPRING_PROFILES_ACTIVE: .*' with 'SPRING_PROFILES_ACTI...(truncated)'
┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].apply.then.transformations[1] (IfElse)
┃ ┃ ┃ ┗ ┗ null ()
┃ ┃ ┃ ╺  Info Will replace [JAVA_VERSION->21]
┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[7] (Merge)
┃ ┃ ┃ ┃  Info Running Merge(Select, InvokeFragment)
┃ ┃ ┃ ┃ ┏ Debug LICENSE matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug .gitignore matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug .gitattributes matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug gradle.properties matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/albums.json matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/index.html matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/css/app.css matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/css/multi-columns-row.css matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/js/info.js matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/js/errors.js matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/js/status.js matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/js/albums.js matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/js/app.js matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/img/glyphicons-halflings.png matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/img/glyphicons-halflings-white.png matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/status.html matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/list.html matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/grid.html matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/albums.html matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/errors.html matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/footer.html matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/header.html matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/albumForm.html matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug build.gradle matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/music/ApplicationTests.java matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/Application.java matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/web/InfoController.java matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/web/ErrorController.java matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/web/AlbumController.java matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/repositories/jpa/JpaAlbumRepository.java matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/repositories/AlbumRepositoryPopulator.java matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/domain/Album.java matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/domain/ApplicationInfo.java matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug settings.gradle matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug manifest.yml matched ['**'] -> included
┃ ┃ ┃ ┃ ┗ Debug README.md matched ['**'] -> included
┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[7].sources[1] (InvokeFragment)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[7].sources[1].validated (Chain)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(ApplyTo, ApplyTo, ApplyTo, ApplyTo, ApplyTo)
┃ ┃ ┃ ┃ ┃ ┃ ╺ engine.transformations[1].validated.transformations[7].sources[1].validated.transformations[0].apply (UniquePath)
┃ ┃ ┃ ┃ ┃ ┃ ╺  Info Will replace regex '<java.version>.*<' with '<java.version>21<'
┃ ┃ ┃ ┃ ┃ ┃ ╺  Info Will replace regex 'sourceCompatibility = .*' with 'sourceCompatibility ...(truncated)'
┃ ┃ ┃ ┃ ┃ ┃ ╺  Info Will replace regex '(?<unmodified>JavaVersion\.VERSION_)(\d+)' with '${unmodified}21'
┃ ┃ ┃ ┗ ┗ ┗ ╺  Info Will replace regex 'JBP_CONFIG_OPEN_JDK_JRE: .*' with 'JBP_CONFIG_OPEN_JDK_...(truncated)'
┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[8] (UniquePath)
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/java/com/example/music/domain/Album.java', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/resources/static/templates/header.html', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path '.gitignore', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/java/com/example/music/web/AlbumController.java', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path '.gitattributes', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/resources/static/templates/grid.html', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/resources/static/js/albums.js', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/resources/static/js/info.js', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/java/com/example/music/repositories/jpa/JpaAlbumRepository.java', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/resources/static/templates/footer.html', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/resources/static/templates/status.html', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/resources/static/js/app.js', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'build.gradle', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/resources/static/templates/errors.html', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/java/com/example/music/web/InfoController.java', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/java/com/example/music/domain/ApplicationInfo.java', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/test/java/com/example/music/ApplicationTests.java', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/resources/static/img/glyphicons-halflings-white.png', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'LICENSE', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'settings.gradle', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/resources/albums.json', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/resources/static/js/errors.js', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/resources/static/templates/albumForm.html', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/resources/static/css/app.css', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/java/com/example/music/Application.java', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/resources/static/templates/list.html', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'README.md', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/java/com/example/music/repositories/AlbumRepositoryPopulator.java', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'gradle.properties', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/resources/static/index.html', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/resources/static/img/glyphicons-halflings.png', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/resources/static/js/status.js', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'manifest.yml', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/resources/static/templates/albums.html', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/java/com/example/music/web/ErrorController.java', will use the one appearing last 
┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/resources/static/css/multi-columns-row.css', will use the one appearing last 
┃ ┃ ┃ ┗ Debug Multiple representations for path 'src/main/resources/application.yml', will use the one appearing last 
┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[9] (Merge)
┃ ┃ ┃ ┃  Info Running Merge(Select, InvokeFragment)
┃ ┃ ┃ ┃ ┏ Debug src/main/java/com/example/music/domain/Album.java matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/header.html matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug .gitignore matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/web/AlbumController.java matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug .gitattributes matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/grid.html matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/js/albums.js matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/js/info.js matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/repositories/jpa/JpaAlbumRepository.java matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/footer.html matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/status.html matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/js/app.js matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug build.gradle matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/errors.html matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/web/InfoController.java matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/domain/ApplicationInfo.java matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/music/ApplicationTests.java matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/img/glyphicons-halflings-white.png matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug LICENSE matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug settings.gradle matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/albums.json matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/js/errors.js matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/albumForm.html matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/css/app.css matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/Application.java matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/list.html matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug README.md matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/repositories/AlbumRepositoryPopulator.java matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug gradle.properties matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/index.html matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/img/glyphicons-halflings.png matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/js/status.js matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug manifest.yml matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/albums.html matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/web/ErrorController.java matched ['**'] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/css/multi-columns-row.css matched ['**'] -> included
┃ ┃ ┃ ┃ ┗ Debug src/main/resources/application.yml matched ['**'] -> included
┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[9].sources[1] (InvokeFragment)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[9].sources[1].validated (IfElse)
┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[1].validated.transformations[9].sources[1].validated.then (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [gradlew*, gradle/**]
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/domain/Album.java didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/header.html didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/web/AlbumController.java didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitattributes didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/grid.html didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/js/albums.js didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/js/info.js didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/repositories/jpa/JpaAlbumRepository.java didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/footer.html didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/status.html didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/js/app.js didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug build.gradle didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/errors.html didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/web/InfoController.java didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/domain/ApplicationInfo.java didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/music/ApplicationTests.java didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/img/glyphicons-halflings-white.png didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug settings.gradle didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/albums.json didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/js/errors.js didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/albumForm.html didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/css/app.css didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/Application.java didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/list.html didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/repositories/AlbumRepositoryPopulator.java didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug gradle.properties didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/index.html didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/img/glyphicons-halflings.png didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/js/status.js didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug manifest.yml didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/templates/albums.html didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/music/web/ErrorController.java didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/css/multi-columns-row.css didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [gradlew*, gradle/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug gradle/wrapper/gradle-wrapper.jar matched [gradlew*, gradle/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug gradle/wrapper/gradle-wrapper.properties matched [gradlew*, gradle/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug gradlew matched [gradlew*, gradle/**] -> included
┃ ┃ ┃ ┗ ┗ ┗ Debug gradlew.bat matched [gradlew*, gradle/**] -> included
┃ ┃ ┃ ╺ engine.transformations[1].validated.transformations[10] (UniquePath)
┃ ┗ ┗ ╺ engine.transformations[1].validated.transformations[11] (Provenance)
┗ ╺ engine.transformations[2] (UniquePath)
```
