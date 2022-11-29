import { Movie } from './movie';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})

export class MovieService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getMovies(): Observable<Movie[]>{
    return this.http.get<Movie[]>(`${this.apiServerUrl}/movie/findAllMovies`);
  }

  public addMovie(movie: Movie): Observable<Movie>{
    return this.http.post<Movie>(`${this.apiServerUrl}/api/movie/add`, movie);
  }

  public updateMovie(movie: Movie): Observable<Movie>{
    return this.http.put<Movie>(`${this.apiServerUrl}/api/movie/update`, movie);
  }

  public deleteMovie(movieID: number): Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/movie/delete/${movieID}`);
  }
}
