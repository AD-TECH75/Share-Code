import AnimeList from "@/app/component/AnimeList";
import Header from "@/app/component/AnimeList/header";


const Home = async () => {

  const response = await fetch(`${process.env.NEXT_PUBLIC_API_BASE_URL}/top/anime?limit=10`)
  const topAnime = await response.json()


  return (
    <>
      <section>
        <Header title="Paling Populer" linkTitle="lihat semua" linkHref="/populer" />
        <AnimeList api={topAnime} />
      </section>
    </>
  );
}

export default Home